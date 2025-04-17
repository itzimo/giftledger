package com.itzimo.giftledger.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itzimo.giftledger.mapper.SysUsersMapper;
import com.itzimo.giftledger.model.entity.SysUsers;
import com.itzimo.giftledger.service.SysUsersService;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static com.itzimo.giftledger.utils.PasswordUtil.checkPassword;

/**
 * @author loser
 * @description 针对表【sys_users(系统用户表)】的数据库操作Service实现
 * @createDate 2025-04-17 16:03:52
 */
@Service
public class SysUsersServiceImpl extends ServiceImpl<SysUsersMapper, SysUsers>
        implements SysUsersService {


    @Override
    public SysUsers doLogin(String username, String password) {
        LambdaQueryWrapper<SysUsers> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUsers::getUsername, username);
        SysUsers sysUsers = getOne(queryWrapper);
        if (Objects.isNull(sysUsers)) {
            throw new RuntimeException("用户名或密码错误");
        }
        boolean isMatch = checkPassword(password, sysUsers.getPassword());
        if (!isMatch) {
            throw new RuntimeException("用户名或密码错误");
        }
        return sysUsers;
    }
}




