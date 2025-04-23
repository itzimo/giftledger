package com.itzimo.giftledger.common.exception;

/**
 * 业务异常类
 *
 * @author zimo
 * @date 2025/04/14
 */
public class BusinessException extends GlobalException {
    public BusinessException(int code, String message) {
        super(code, message);
    }
}