package com.itzimo.giftledger.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 礼薄表
 *
 * @TableName gift_books
 */
@TableName(value = "gift_books")
@Data
public class GiftBooks {
    /**
     * 礼薄ID
     */
    @TableId
    private Long id;

    /**
     * 系统用户ID
     */
    private Long userId;

    /**
     * 礼薄名称
     */
    private String name;

    /**
     * 礼薄类型（GIVING: 随礼，RECEIVING: 收礼）
     */
    private Object type;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}