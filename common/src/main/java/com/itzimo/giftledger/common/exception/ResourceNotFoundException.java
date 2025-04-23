package com.itzimo.giftledger.common.exception;

/**
 * 资源不存在异常
 *
 * @author zimo
 * @date 2025/04/23
 */
public class ResourceNotFoundException extends BusinessException {

    public ResourceNotFoundException() {
        super(504, "resource.not.found");
    }
}
