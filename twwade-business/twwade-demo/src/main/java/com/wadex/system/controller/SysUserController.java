package com.wadex.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wadex.common.core.domain.R;
import com.wadex.common.core.utils.StringUtils;
import com.wadex.common.core.web.controller.BaseController;
import com.wadex.common.log.annotation.Log;
import com.wadex.common.log.enums.BusinessType;
import com.wadex.common.security.utils.SecurityUtils;
import com.wadex.demo.domain.system.SysUser;
import com.wadex.system.api.vo.LoginUser;
import com.wadex.system.service.ISysUserService;

/**
 * 用户信息
 * 
 * @author twwade
 */
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController {
    private static final Logger log = LoggerFactory.getLogger(SysUserController.class);
    
    @Autowired
    private ISysUserService userService;
    
    /**
     * 获取当前用户信息
     */
    @GetMapping("/info/{username}")
    public R<LoginUser> info(@PathVariable("username") String username) {
        SysUser sysUser = userService.selectUserByUserName(username);
        Long userId = SecurityUtils.getUserId();
        System.out.println("================userId===:" + userId);
        if (StringUtils.isNull(sysUser)) {
            return R.fail("用户名或密码错误");
        }
        //        // 角色集合
        //        Set<String> roles = permissionService.getRolePermission(sysUser.getUserId());
        //        // 权限集合
        //        Set<String> permissions = permissionService.getMenuPermission(sysUser.getUserId());
        LoginUser sysUserVo = new LoginUser();
        sysUserVo.setSysUser(sysUser);
        //        sysUserVo.setRoles(roles);
        //        sysUserVo.setPermissions(permissions);
        return R.ok(sysUserVo);
    }
    
    /**
     * 获取当前用户信息
     */
    @Log(title = "获取当前用户信息", businessType = BusinessType.CLEAN)
    @GetMapping("/list")
    public R<LoginUser> list(@RequestBody String name) {
        Long userId = SecurityUtils.getUserId();
        String getUsername = SecurityUtils.getUsername();
        log.info("================userId===:" + userId);
        log.info("================getUsername===:" + getUsername);
        log.info("================name===:" + name);
        return R.ok();
    }
    
}
