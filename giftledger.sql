-- 创建用户表
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '用户ID',
    username VARCHAR(255) NOT NULL UNIQUE COMMENT '用户名',
    password VARCHAR(255) NOT NULL COMMENT '密码',
    email VARCHAR(255) NOT NULL UNIQUE COMMENT '电子邮件',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) COMMENT='用户表';

-- 创建人情记录表
CREATE TABLE gift_records (
    id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '记录ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    recipient_name VARCHAR(255) NOT NULL COMMENT '收礼人姓名',
    date DATE NOT NULL COMMENT '日期',
    amount DECIMAL(10, 2) NOT NULL COMMENT '金额',
    reason TEXT COMMENT '事由',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    FOREIGN KEY (user_id) REFERENCES users(id)
) COMMENT='人情记录表';

-- 创建索引以提高查询性能
CREATE INDEX idx_gift_records_user_id ON gift_records(user_id) COMMENT '用户ID索引';
CREATE INDEX idx_gift_records_date ON gift_records(date) COMMENT '日期索引';