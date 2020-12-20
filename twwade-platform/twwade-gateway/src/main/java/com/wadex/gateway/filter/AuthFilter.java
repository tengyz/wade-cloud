package com.wadex.gateway.filter;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.alibaba.fastjson.JSON;
import com.wadex.common.core.constant.CacheConstants;
import com.wadex.common.core.constant.Constants;
import com.wadex.common.core.domain.R;
import com.wadex.common.core.utils.StringUtils;
import com.wadex.common.redis.service.RedisService;
import com.wadex.common.ribbon.config.ConfigConstants;
import com.wadex.common.ribbon.rule.LbIsolationContextHolder;
import com.wadex.gateway.config.properties.IgnoreWhiteProperties;

import cn.hutool.core.util.StrUtil;
import reactor.core.publisher.Mono;

/**
 * 网关鉴权
 * 
 * @author twwade
 */
@Component
public class AuthFilter implements GlobalFilter, Ordered {
    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class);
    
    private final static long EXPIRE_TIME = Constants.TOKEN_EXPIRE * 60;
    
    // 排除过滤的 uri 地址，nacos自行添加
    @Autowired
    private IgnoreWhiteProperties ignoreWhite;
    
    @Resource(name = "stringRedisTemplate")
    private ValueOperations<String, String> sops;
    
    @Autowired
    private RedisService redisService;
    
    @Value("${" + ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED + ":false}")
    private boolean enableIsolation;
    
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url = exchange.getRequest().getURI().getPath();
        ServerHttpRequest request = exchange.getRequest();
        //开发隔离切换到本地，防止调用冲突，只用与开发阶段
        if (enableIsolation) {
            String version = request.getHeaders().getFirst(ConfigConstants.DEV_VERSION);
            if (StrUtil.isNotEmpty(version)) {
                System.out.println("=======AuthFilter======LbIsolationContextHolder.setVersion=========version=:" + version);
                LbIsolationContextHolder.setVersion(version);
            }
        }
        // 跳过不需要验证的路径
        if (StringUtils.matches(url, ignoreWhite.getWhites())) {
            return chain.filter(exchange);
        }
        
        String token = getToken(request);
        if (StringUtils.isBlank(token)) {
            return setUnauthorizedResponse(exchange, "令牌不能为空");
        }
        String userStr = sops.get(getTokenKey(token));
        if (StringUtils.isNull(userStr)) {
            return setUnauthorizedResponse(exchange, "登录状态已过期");
        }
        //设置用户权限
        // 设置过期时间
        redisService.expire(getTokenKey(token), EXPIRE_TIME);
        redisService.expire(getTokenauthorization(token), EXPIRE_TIME);
        // 设置用户信息到请求
        //        Consumer<HttpHeaders> httpHeaders =
        // 设置用户信息到请求
        ServerHttpRequest mutableReq = exchange.getRequest().mutate().header(CacheConstants.HEADER, CacheConstants.TOKEN_PREFIX + token).build();
        ServerWebExchange mutableExchange = exchange.mutate().request(mutableReq).build();
        
        return chain.filter(mutableExchange);
    }
    
    private Mono<Void> setUnauthorizedResponse(ServerWebExchange exchange, String msg) {
        ServerHttpResponse response = exchange.getResponse();
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
        response.setStatusCode(HttpStatus.OK);
        
        log.error("[鉴权异常处理]请求路径:{}", exchange.getRequest().getPath());
        
        return response.writeWith(Mono.fromSupplier(() -> {
            DataBufferFactory bufferFactory = response.bufferFactory();
            return bufferFactory.wrap(JSON.toJSONBytes(R.fail(msg)));
        }));
    }
    
    private String getTokenKey(String token) {
        return CacheConstants.LOGIN_TOKEN_KEY + token;
    }
    
    private String getTokenauthorization(String token) {
        return CacheConstants.DETAILS_AUTHORIZATION + token;
    }
    
    /**
     * 获取请求token
     */
    private String getToken(ServerHttpRequest request) {
        String token = request.getHeaders().getFirst(CacheConstants.HEADER);
        if (StringUtils.isNotEmpty(token) && token.startsWith(CacheConstants.TOKEN_PREFIX)) {
            token = token.replace(CacheConstants.TOKEN_PREFIX, "");
        }
        return token;
    }
    
    @Override
    public int getOrder() {
        return -200;
    }
}