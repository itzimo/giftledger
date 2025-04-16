package com.itzimo.giftledger.controller;

import com.itzimo.giftledger.common.GlobalResponse;
import com.itzimo.giftledger.mapping.GiftBooksMapping;
import com.itzimo.giftledger.model.dto.GiftBookCreateRequest;
import com.itzimo.giftledger.model.dto.GiftBookGetResponse;
import com.itzimo.giftledger.model.entity.GiftBooksDO;
import com.itzimo.giftledger.service.GiftBooksService;
import org.springframework.validation.annotation.Validated;
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
     * @param request 礼薄信息
     * @return 创建结果
     */
    @PostMapping("/create")
    public GlobalResponse<GiftBooksDO> createGiftBook(@Validated @RequestBody GiftBookCreateRequest request) {
        GiftBooksDO giftBook = GiftBooksMapping.INSTANCE.toDO(request);
        giftBook.setUserId(1L);
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
    public GlobalResponse<GiftBookGetResponse> getGiftBook(Long id) {
        GiftBooksDO giftBook = giftBooksService.getById(id);
        GiftBookGetResponse dto = GiftBooksMapping.INSTANCE.toDTO(giftBook);
        return GlobalResponse.success(dto);
    }
}
