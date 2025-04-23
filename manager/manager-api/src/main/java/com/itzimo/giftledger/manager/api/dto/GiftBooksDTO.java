package com.itzimo.giftledger.manager.api.dto;

import lombok.Data;

import java.util.Date;

/**
 * 礼薄 DTO
 *
 * @author zimo
 * @date 2025/04/23
 */
@Data
public class GiftBooksDTO {
    /**
     * 礼薄id
     */
    private Long id;
    /**
     * 礼薄名称
     */
    private String name;

    /**
     * 礼薄类型（GIVING: 随礼，RECEIVING: 收礼）
     */
    private String type;

    /**
     * 创建于时间
     * Thymeleaf 的 Dates 表达式对象主要支持 java.util.Date 和 java.util.Calendar 类型
     */
    private Date createdAt;
}
