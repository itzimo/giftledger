package com.itzimo.giftledger.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 礼品簿创建请求
 *
 * @author zimo
 * @date 2025/04/16
 */
@Data
public class GiftBookDTO {
    private Long id;
    /**
     * 礼薄名称
     */
    private String name;

    /**
     * 礼薄类型（GIVING: 随礼，RECEIVING: 收礼）
     */
    private String type;

    private LocalDateTime createdAt;
}
