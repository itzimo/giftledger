package com.itzimo.giftledger.common.base;

import lombok.Data;

/**
 * 全局结果响应类
 *
 * @author zimo
 * @date 2025/04/14
 */
@Data
public class Result<T> {
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

    public static Result<?> ok() {
        Result<?> response = new Result<>();
        response.setCode(200);
        response.setMessage("操作成功");
        return response;
    }

    public static Result<?> ok(String message) {
        Result<?> response = new Result<>();
        response.setCode(200);
        response.setMessage(message);
        return response;
    }

    /**
     * 成功响应
     */
    public static <T> Result<T> data(T data) {
        Result<T> response = new Result<>();
        response.setCode(200);
        response.setMessage("操作成功");
        response.setData(data);
        return response;
    }

    /**
     * 失败响应
     */
    public static <T> Result<T> fail(int code, String message) {
        Result<T> response = new Result<>();
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> response = new Result<>();
        response.setCode(500);
        response.setMessage(message);
        return response;
    }
}