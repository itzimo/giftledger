package com.itzimo.giftledger.common.exception;

import lombok.Getter;

/**
 * 全局异常类
 *
 * @author zimo
 * @date 2025/04/14
 */
@Getter
public class GlobalException extends RuntimeException {
    private final int code;

    public GlobalException(int code, String message) {
        super(message);
        this.code = code;
    }
}