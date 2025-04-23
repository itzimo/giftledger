package com.itzimo.giftledger.app.api.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 礼品书创建请求
 *
 * @author zimo
 * @date 2025/04/23
 */
@Data
public class GiftBooksUpdateRequest {
    /**
     * 礼薄id
     */
    @NotNull(message = "礼薄id不能为空")
    private Long id;

    /**
     * 礼薄名称
     */
    private String name;

    /**
     * 礼薄类型（GIVING: 随礼，RECEIVING: 收礼）
     */
    private String type;
}
