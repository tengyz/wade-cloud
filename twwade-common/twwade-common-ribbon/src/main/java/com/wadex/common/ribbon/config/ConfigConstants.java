package com.wadex.common.ribbon.config;

/**
 * 配置项常量
 * @Description TODO 
 * @ClassName   ConfigConstants 
 * @Date        2020-10-29 03:20:19 
 * @Author      tengyizu
 */
public interface ConfigConstants {
    /**
     * 是否开启自定义隔离规则
     */
    String CONFIG_RIBBON_ISOLATION_ENABLED = "dev.ribbon.isolation.enabled";
    
    /**
     * 注册中心元数据 版本号
     */
    String METADATA_VERSION = "version";
    
    /**
     * 负载均衡策略-版本号 信息头
     */
    String DEV_VERSION = "dev-version";
}
