package com.itzimo.giftledger.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itzimo.giftledger.model.entity.SysUsers;

/**
 * @author loser
 * @description 针对表【sys_users(系统用户表)】的数据库操作Service
 * @createDate 2025-04-17 16:03:52
 */
public interface SysUsersService extends IService<SysUsers> {

    SysUsers doLogin(String username, String password);
}
