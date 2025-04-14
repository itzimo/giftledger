-- 创建用户表
CREATE TABLE users
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '用户ID',
    username   VARCHAR(255) NOT NULL UNIQUE COMMENT '用户名',
    password   VARCHAR(255) NOT NULL COMMENT '密码',
    email      VARCHAR(255) NOT NULL UNIQUE COMMENT '电子邮件',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) COMMENT ='用户表';

-- 创建礼薄表
CREATE TABLE gift_books
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '礼薄ID',
    user_id    BIGINT                       NOT NULL COMMENT '用户ID',
    name       VARCHAR(255)                 NOT NULL COMMENT '礼薄名称',
    type       ENUM ('GIVING', 'RECEIVING') NOT NULL COMMENT '礼薄类型（GIVING: 随礼，RECEIVING: 收礼）',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) COMMENT ='礼薄表';

-- 创建礼薄记录表
CREATE TABLE gift_book_entries
(
    id             BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '记录ID',
    gift_book_id   BIGINT         NOT NULL COMMENT '礼薄ID',
    recipient_name VARCHAR(255)   NOT NULL COMMENT '收礼人姓名',
    date           DATE           NOT NULL COMMENT '日期',
    amount         DECIMAL(10, 2) NOT NULL COMMENT '金额',
    reason         TEXT COMMENT '事由',
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) COMMENT ='礼薄记录表';

-- 创建索引以提高查询性能
CREATE INDEX idx_gift_book_entries_gift_book_id ON gift_book_entries (gift_book_id) COMMENT '礼薄ID索引';
CREATE INDEX idx_gift_book_entries_date ON gift_book_entries (date) COMMENT '日期索引';



