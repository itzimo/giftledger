package com.itzimo.giftledger.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itzimo.giftledger.dao.Users;
import com.itzimo.giftledger.service.UsersService;
import com.itzimo.giftledger.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author zimo
* @description 针对表【users(系统用户表)】的数据库操作Service实现
* @createDate 2025-04-14 20:38:06
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




