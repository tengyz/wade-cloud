package com.wadex.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wadex.common.core.web.controller.BaseController;
import com.wadex.common.core.web.domain.AjaxResult;
import com.wadex.demo.domain.system.SysOperLog;
import com.wadex.system.service.ISysOperLogService;

/**
 * 操作日志记录
 * 
 * @author twwade
 */
@RestController
@RequestMapping("/operlog")
public class SysOperlogController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(SysOperlogController.class);
    
    @Autowired
    private ISysOperLogService operLogService;
    
    @PostMapping("/logininfor")
    public AjaxResult add(@RequestParam("username") String username, @RequestParam("status") String status, @RequestParam("message") String message) {
        log.info("===logininfor===登陆日志打印==========username===:" + username);
        log.info("===logininfor===登陆日志打印==========status===:" + status);
        log.info("===logininfor===登陆日志打印==========message===:" + message);
        
        return AjaxResult.success();
    }
    
    @PostMapping("/operlog")
    public AjaxResult operlog(@RequestBody SysOperLog sysOperLog) {
        log.info("===operlog===登陆日志打印==========getOperName===:" + sysOperLog.getOperName());
        log.info("====operlog==登陆日志打印==========getOperUrl===:" + sysOperLog.getOperUrl());
        //log.info("====operlog==登陆日志打印==========getRemark===:" + sysOperLog.getRemark());
        
        return AjaxResult.success();
    }
}
