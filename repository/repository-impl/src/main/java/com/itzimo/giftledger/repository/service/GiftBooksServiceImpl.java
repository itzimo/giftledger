package com.itzimo.giftledger.repository.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itzimo.giftledger.repository.api.entity.GiftBooksDO;
import com.itzimo.giftledger.repository.api.mapper.GiftBooksMapper;
import com.itzimo.giftledger.repository.api.service.GiftBooksService;
import org.springframework.stereotype.Service;

/**
 * @author zimo
 * @description 针对表【gift_books(礼薄表)】的数据库操作Service实现
 * @createDate 2025-04-14 20:38:06
 */
@Service
public class GiftBooksServiceImpl extends ServiceImpl<GiftBooksMapper, GiftBooksDO>
        implements GiftBooksService {

}