package com.wadex.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import com.wadex.common.security.annotation.EnableCustomConfig;
import com.wadex.common.security.annotation.EnableRyFeignClients;

/**
 * 系统模块
 * 
 * @author twwade
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringCloudApplication
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        System.out.println("====tw-wade======系统模块启动成功======ok=====\n");
    }
}
