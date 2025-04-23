package com.itzimo.giftledger.repository.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itzimo.giftledger.repository.api.entity.GiftBookUsersDO;
import com.itzimo.giftledger.repository.api.mapper.GiftBookUsersMapper;
import com.itzimo.giftledger.repository.api.service.GiftBookUsersService;
import org.springframework.stereotype.Service;

/**
 * @author zimo
 * @description 针对表【gift_book_users(礼薄用户表)】的数据库操作Service实现
 * @createDate 2025-04-14 20:38:06
 */
@Service
public class GiftBookUsersServiceImpl extends ServiceImpl<GiftBookUsersMapper, GiftBookUsersDO>
        implements GiftBookUsersService {

}
