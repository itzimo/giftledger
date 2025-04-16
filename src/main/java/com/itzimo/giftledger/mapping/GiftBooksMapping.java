package com.itzimo.giftledger.mapping;

import com.itzimo.giftledger.model.dto.GiftBookCreateRequest;
import com.itzimo.giftledger.model.dto.GiftBookDTO;
import com.itzimo.giftledger.model.entity.GiftBooksDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 礼品书籍映射
 *
 * @author zimo
 * @date 2025/04/16
 */
@Mapper
public interface GiftBooksMapping {
    GiftBooksMapping INSTANCE = Mappers.getMapper(GiftBooksMapping.class);

    /**
     * 转换成DO
     *
     * @param request 请求
     * @return {@link GiftBooksDO }
     */
    GiftBooksDO toDO(GiftBookCreateRequest request);
    GiftBookDTO toDTO(GiftBooksDO giftBooksDO);
}
