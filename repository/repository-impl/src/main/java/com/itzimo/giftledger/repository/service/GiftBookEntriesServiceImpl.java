package com.itzimo.giftledger.repository.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itzimo.giftledger.repository.api.entity.GiftBookEntriesDO;
import com.itzimo.giftledger.repository.api.mapper.GiftBookEntriesMapper;
import com.itzimo.giftledger.repository.api.service.GiftBookEntriesService;
import org.springframework.stereotype.Service;

/**
 * @author zimo
 * @description 针对表【gift_book_entries(礼薄记录表)】的数据库操作Service实现
 * @createDate 2025-04-14 20:38:06
 */
@Service
public class GiftBookEntriesServiceImpl extends ServiceImpl<GiftBookEntriesMapper, GiftBookEntriesDO>
        implements GiftBookEntriesService {

}