package com.wadex.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import com.wadex.common.security.annotation.EnableCustomConfig;
import com.wadex.common.security.annotation.EnableRyFeignClients;

/**
 * demo模块
 * 
 * @author twwade
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringCloudApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("====tw-wade======demo模块启动成功======ok=====\n");
    }
}
