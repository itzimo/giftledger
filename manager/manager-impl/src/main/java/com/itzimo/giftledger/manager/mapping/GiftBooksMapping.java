package com.itzimo.giftledger.manager.mapping;

import com.itzimo.giftledger.manager.api.dto.GiftBooksDTO;
import com.itzimo.giftledger.repository.api.entity.GiftBooksDO;
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

    GiftBooksDO toDO(GiftBooksDTO source);

    GiftBooksDTO toDTO(GiftBooksDO source);
}
