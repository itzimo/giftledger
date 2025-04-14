package com.itzimo.giftledger.exception;

/**
 * 全局异常类
 */
public class GlobalException extends RuntimeException {
    private int code;

    public GlobalException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}