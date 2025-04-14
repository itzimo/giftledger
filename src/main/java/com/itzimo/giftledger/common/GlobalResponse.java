package com.itzimo.giftledger.common;

import lombok.Data;

/**
 * 全局结果响应类
 *
 * @author zimo
 * @date 2025/04/14
 */
@Data
public class GlobalResponse<T> {
    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 成功响应
     */
    public static <T> GlobalResponse<T> success(T data) {
        GlobalResponse<T> response = new GlobalResponse<>();
        response.setCode(200);
        response.setMessage("成功");
        response.setData(data);
        return response;
    }

    /**
     * 失败响应
     */
    public static <T> GlobalResponse<T> failure(int code, String message) {
        GlobalResponse<T> response = new GlobalResponse<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }
}