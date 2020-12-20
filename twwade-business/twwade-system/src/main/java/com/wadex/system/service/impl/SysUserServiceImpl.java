package com.wadex.system.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wadex.demo.domain.system.SysUser;
import com.wadex.system.mapper.SysUserMapper;
import com.wadex.system.service.ISysUserService;

/**
 * 用户 业务层处理
 * 
 * @author twwade
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);
    
    @Autowired
    private SysUserMapper userMapper;
    
    /**
     * 通过用户名查询用户
     * 
     * @param userName 用户名
     * @return 用户对象信息
     */
    @Override
    public SysUser selectUserByUserName(String userName) {
        return userMapper.selectUserByUserName(userName);
    }
    
}
