package com.wadex.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import com.wadex.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author twwade
 */
@EnableRyFeignClients
@SpringCloudApplication
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
        System.out.println("============认证授权中心启动成功=============\n");
        
    }
}
