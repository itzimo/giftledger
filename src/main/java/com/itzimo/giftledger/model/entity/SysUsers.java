package com.itzimo.giftledger.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 系统用户表
 * @TableName sys_users
 */
@TableName(value ="sys_users")
@Data
public class SysUsers {
    /**
     * 用户ID
     */
    @TableId
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}
