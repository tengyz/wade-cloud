package com.wadex.common.ribbon.rule;

import com.alibaba.ttl.TransmittableThreadLocal;

/**
 * 负载均衡策略Holder
 * @Description 负载均衡策略Holder 
 * @ClassName   LbIsolationContextHolder 
 * @Date        2020-10-29 03:20:04 
 * @Author      tengyizu
 */
public class LbIsolationContextHolder {
    private static final ThreadLocal<String> VERSION_CONTEXT = new TransmittableThreadLocal<>();
    
    public static void setVersion(String version) {
        VERSION_CONTEXT.set(version);
    }
    
    public static String getVersion() {
        return VERSION_CONTEXT.get();
    }
    
    public static void clear() {
        VERSION_CONTEXT.remove();
    }
}
