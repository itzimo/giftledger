package com.itzimo.giftledger.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.itzimo.giftledger.model.entity.SysUsers;
import com.itzimo.giftledger.service.SysUsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * sys用户控制器
 *
 * @author zimo
 * @date 2025/04/17
 */
@RestController
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysUsersService userService;

    @RequestMapping("doLogin")
    public SaResult doLogin(String username, String password) {
        SysUsers sysUsers = userService.doLogin(username, password);
        StpUtil.login(sysUsers.getId());
        return SaResult.ok("登录成功");
    }
}
