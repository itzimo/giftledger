package com.itzimo.giftledger.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itzimo.giftledger.model.entity.GiftBooksDO;
import com.itzimo.giftledger.service.GiftBooksService;
import com.itzimo.giftledger.mapper.GiftBooksMapper;
import org.springframework.stereotype.Service;

/**
* @author zimo
* @description 针对表【gift_books(礼薄表)】的数据库操作Service实现
* @createDate 2025-04-14 20:38:06
*/
@Service
public class GiftBooksServiceImpl extends ServiceImpl<GiftBooksMapper, GiftBooksDO>
    implements GiftBooksService{

}




