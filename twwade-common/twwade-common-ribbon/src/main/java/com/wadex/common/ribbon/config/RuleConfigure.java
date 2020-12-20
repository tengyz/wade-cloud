package com.wadex.common.ribbon.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.cloud.nacos.ribbon.NacosServer;
import com.netflix.loadbalancer.IRule;
import com.wadex.common.ribbon.rule.VersionIsolationRule;

/**
 * RuleConfigure
 * @Description RuleConfigure 
 * @ClassName   RuleConfigure 
 * @Date        2020-10-29 03:20:36 
 * @Author      tengyizu
 */
public class RuleConfigure {
    
    @ConditionalOnClass(NacosServer.class)
    @ConditionalOnMissingBean
    @Bean
    public IRule versionIsolationRule() {
        System.out.println("=======初始化======RuleConfigure.versionIsolationRule=========ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED=:"
                + ConfigConstants.CONFIG_RIBBON_ISOLATION_ENABLED);
        return new VersionIsolationRule();
    }
}
