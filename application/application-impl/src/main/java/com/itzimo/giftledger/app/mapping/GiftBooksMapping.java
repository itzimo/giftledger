package com.itzimo.giftledger.app.mapping;

import com.itzimo.giftledger.app.api.request.GiftBooksCreateRequest;
import com.itzimo.giftledger.app.api.request.GiftBooksUpdateRequest;
import com.itzimo.giftledger.manager.api.dto.GiftBooksDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 礼品书籍映射
 *
 * @author zimo
 * @date 2025/04/23
 */
@Mapper
public interface GiftBooksMapping {

    GiftBooksMapping INSTANCE = Mappers.getMapper(GiftBooksMapping.class);

    GiftBooksDTO toDTO(GiftBooksCreateRequest source);

    GiftBooksDTO toDTO(GiftBooksUpdateRequest source);
}