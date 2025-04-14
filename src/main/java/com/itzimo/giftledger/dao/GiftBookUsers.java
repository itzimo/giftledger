package com.itzimo.giftledger.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 礼薄用户表
 * @TableName gift_book_users
 */
@TableName(value ="gift_book_users")
@Data
public class GiftBookUsers {
    /**
     * 礼薄用户ID
     */
    @TableId
    private Long id;

    /**
     * 礼薄ID
     */
    private Long giftBookId;

    /**
     * 礼薄用户姓名
     */
    private String name;

    /**
     * 备注（用于区分重名用户）
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}