package com.itzimo.giftledger.controller;

import com.itzimo.giftledger.common.GlobalResponse;
import com.itzimo.giftledger.dao.GiftBooks;
import com.itzimo.giftledger.service.GiftBooksService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 礼薄控制器
 *
 * @author zimo
 * @date 2025/04/14
 */
@RestController
@RequestMapping("/gift-book")
public class GiftBookController {

    @Resource
    private GiftBooksService giftBooksService;

    /**
     * 创建礼薄接口
     *
     * @param giftBook 礼薄信息
     * @return 创建结果
     */
    @PostMapping("/create")
    public GlobalResponse<GiftBooks> createGiftBook(@RequestBody GiftBooks giftBook) {
        giftBooksService.save(giftBook);
        return GlobalResponse.success(giftBook);
    }

    /**
     * 获取礼薄接口
     *
     * @param id 礼薄ID
     * @return 礼薄信息
     */
    @PostMapping("/get")
    public GlobalResponse<GiftBooks> getGiftBook(Long id) {
        GiftBooks giftBook = giftBooksService.getById(id);
        return GlobalResponse.success(giftBook);
    }
}