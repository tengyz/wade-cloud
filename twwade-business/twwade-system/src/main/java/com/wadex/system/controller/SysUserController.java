package com.wadex.system.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wadex.common.core.domain.R;
import com.wadex.common.core.utils.StringUtils;
import com.wadex.common.core.utils.poi.ExcelUtil;
import com.wadex.common.core.web.controller.BaseController;
import com.wadex.common.log.annotation.Log;
import com.wadex.common.log.enums.BusinessType;
import com.wadex.common.security.utils.SecurityUtils;
import com.wadex.demo.domain.system.SysUser;
import com.wadex.system.api.vo.LoginUser;
import com.wadex.system.domain.vo.TestUser;
import com.wadex.system.service.ISysUserService;

/**
 * 用户信息
 * 
 * @author twwade
 */
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController {
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
        System.out.println("================userId===:" + userId);
        System.out.println("================getUsername===:" + getUsername);
        System.out.println("================name===:" + name);
        
        return R.ok();
    }
    
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysUser user) throws IOException {
        List<TestUser> list = new ArrayList<>();
        TestUser testUser1 = new TestUser();
        testUser1.setUserId(Long.valueOf("11111111"));
        testUser1.setDeptId(Long.valueOf("22222222"));
        list.add(testUser1);
        TestUser testUser2 = new TestUser();
        testUser2.setUserId(Long.valueOf("33333333"));
        testUser2.setDeptId(Long.valueOf("44444444"));
        list.add(testUser2);
        ExcelUtil<TestUser> util = new ExcelUtil<TestUser>(TestUser.class);
        util.exportExcel(response, list, "用户数据");
    }
}
