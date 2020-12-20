package com.wadex.common.security.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 自定义feign注解
 * 添加basePackages路径
 * 
 * @author twwade
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableFeignClients
public @interface EnableRyFeignClients {
    String[] value() default {};
    
    String[] basePackages() default {"com.chinaunicom"};
    
    Class<?>[] basePackageClasses() default {};
    
    Class<?>[] defaultConfiguration() default {};
    
    Class<?>[] clients() default {};
}
