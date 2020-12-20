package com.wadex.common.ribbon;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

import com.wadex.common.ribbon.config.ConfigConstants;
import com.wadex.common.ribbon.config.RuleConfigure;

/**
 * 自定义负载均衡配置
 * @Description 自定义负载均衡配置 
 * @ClassName   LbIsolationAutoConfigure 
 * @Date        2020-10-29 03:21:43 
 * @Author      tengyizu
 */
@ConditionalOnProperty(value = ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED, havingValue = "true")
@RibbonClients(defaultConfiguration = {RuleConfigure.class})
public class LbIsolationAutoConfigure {
    
}
