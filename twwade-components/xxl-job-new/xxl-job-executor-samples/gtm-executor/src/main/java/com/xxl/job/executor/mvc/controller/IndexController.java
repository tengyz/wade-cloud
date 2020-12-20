package com.xxl.job.executor.mvc.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class IndexController {
    
    @RequestMapping("/")
    @ResponseBody
    String index() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("beat at:" + i);
            TimeUnit.SECONDS.sleep(60);
        }
        System.out.println("========================xxl job executor running====================");
        return "xxl job executor running.";
    }
    
}