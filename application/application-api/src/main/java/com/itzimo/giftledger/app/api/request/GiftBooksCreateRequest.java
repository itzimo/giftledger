package com.itzimo.giftledger.app.api.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 礼品书创建请求
 *
 * @author zimo
 * @date 2025/04/23
 */
@Data
public class GiftBooksCreateRequest {
    /**
     * 礼薄名称
     */
    @NotBlank(message = "礼薄名称不能为空")
    private String name;

    /**
     * 礼薄类型（GIVING: 随礼，RECEIVING: 收礼）
     */
    @NotBlank(message = "礼薄类型不能为空")
    private String type;
}
