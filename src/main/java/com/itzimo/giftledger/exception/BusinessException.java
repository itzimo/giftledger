package com.itzimo.giftledger.exception;

/**
 * 业务异常类
 */
public class BusinessException extends GlobalException {
    public BusinessException(int code, String message) {
        super(code, message);
    }
}