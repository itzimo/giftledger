package com.itzimo.giftledger.app.controller;

import com.itzimo.giftledger.app.api.request.GiftBooksCreateRequest;
import com.itzimo.giftledger.app.api.request.GiftBooksUpdateRequest;
import com.itzimo.giftledger.app.mapping.GiftBooksMapping;
import com.itzimo.giftledger.common.base.Result;
import com.itzimo.giftledger.manager.api.GiftBooksManager;
import com.itzimo.giftledger.manager.api.dto.GiftBooksDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 礼品书籍控制器
 *
 * @author zimo
 * @date 2025/04/23
 */
@RequestMapping("/gift-books")
@RestController
public class GiftBooksController {
    @Resource
    private GiftBooksManager manager;

    @PostMapping()
    public Result<Long> create(@Validated @RequestBody GiftBooksCreateRequest request) {
        GiftBooksDTO dto = GiftBooksMapping.INSTANCE.toDTO(request);
        return Result.data(manager.create(dto));
    }

    @PutMapping()
    public Result<?> update(@Validated @RequestBody GiftBooksUpdateRequest request) {
        GiftBooksDTO dto = GiftBooksMapping.INSTANCE.toDTO(request);
        manager.update(dto);
        return Result.ok();
    }

    @GetMapping("/{id}")
    public Result<GiftBooksDTO> get(@PathVariable Long id) {
        return Result.data(manager.get(id));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        manager.delete(id);
        return Result.ok();
    }
}
