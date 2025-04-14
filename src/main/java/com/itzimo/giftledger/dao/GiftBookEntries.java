package com.itzimo.giftledger.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 礼薄记录表
 * @TableName gift_book_entries
 */
@TableName(value ="gift_book_entries")
@Data
public class GiftBookEntries {
    /**
     * 记录ID
     */
    @TableId
    private Long id;

    /**
     * 礼薄ID
     */
    private Long giftBookId;

    /**
     * 礼薄用户ID
     */
    private Long giftBookUserId;

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 事由
     */
    private String reason;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}