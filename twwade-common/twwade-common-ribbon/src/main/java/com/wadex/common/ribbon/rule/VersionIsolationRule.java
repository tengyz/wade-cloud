package com.wadex.common.ribbon.rule;

import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.cloud.nacos.ribbon.NacosServer;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import com.wadex.common.ribbon.config.ConfigConstants;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;

/**
 * 根据实例版本号隔离规则
 *
 * 实例获取规则顺序如下(不满足则走下一个规则)：
 * 1. 相同版本号的实例
 * 2. 无版本号的实例
 * 3. 所有实例中轮询
 * @Description TODO 
 * @ClassName   VersionIsolationRule 
 * @Date        2020-10-29 03:21:22 
 * @Author      tengyizu
 */
public class VersionIsolationRule extends RoundRobinRule {
    private final static String KEY_DEFAULT = "default";
    
    /**
     * 优先根据版本号取实例
     */
    @Override
    public Server choose(ILoadBalancer lb, Object key) {
        System.out.println("=============VersionIsolationRule=========key=:" + key);
        if (lb == null) {
            return null;
        }
        String version;
        if (key != null && !KEY_DEFAULT.equals(key)) {
            version = key.toString();
        }
        else {
            try {
                version = LbIsolationContextHolder.getVersion();
            }
            finally {
                LbIsolationContextHolder.clear();
            }
        }
        System.out.println("=============VersionIsolationRule=========version=:" + version);
        List<Server> targetList = null;
        List<Server> upList = lb.getReachableServers();
        if (StrUtil.isNotEmpty(version)) {
            //取指定版本号的实例
            targetList = upList.stream()
                    .filter(server -> version.equals(((NacosServer)server).getMetadata().get(ConfigConstants.METADATA_VERSION)))
                    .collect(Collectors.toList());
        }
        
        if (CollUtil.isEmpty(targetList)) {
            //只取无版本号的实例
            targetList = upList.stream().filter(server -> {
                String metadataVersion = ((NacosServer)server).getMetadata().get(ConfigConstants.METADATA_VERSION);
                return StrUtil.isEmpty(metadataVersion);
            }).collect(Collectors.toList());
        }
        
        if (CollUtil.isNotEmpty(targetList)) {
            return getServer(targetList);
        }
        return super.choose(lb, key);
    }
    
    /**
     * 随机取一个实例
     */
    private Server getServer(List<Server> upList) {
        int nextInt = RandomUtil.randomInt(upList.size());
        return upList.get(nextInt);
    }
}
