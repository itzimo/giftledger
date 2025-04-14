package com.itzimo.giftledger.exception;

import com.itzimo.giftledger.common.GlobalResponse;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

/**
 * 全局异常处理类
 *
 * @author zimo
 * @date 2025/04/14
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获全局异常
     */
    @ExceptionHandler(Exception.class)
    public GlobalResponse<?> handleException(Exception e) {
        return GlobalResponse.failure(500, "系统异常：" + e.getMessage());
    }

    /**
     * 捕获业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public GlobalResponse<?> handleBusinessException(BusinessException e) {
        return GlobalResponse.failure(e.getCode(), e.getMessage());
    }

    /**
     * 捕获空指针异常
     */
    @ExceptionHandler(NullPointerException.class)
    public GlobalResponse<?> handleNullPointerException(NullPointerException e) {
        return GlobalResponse.failure(500, "空指针异常：" + e.getMessage());
    }

    /**
     * 捕获数据库重复主键异常
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public GlobalResponse<?> handleDuplicateKeyException(DuplicateKeyException e) {
        return GlobalResponse.failure(500, "数据库重复主键异常：" + e.getMessage());
    }

    /**
     * 捕获索引越界异常
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public GlobalResponse<?> handleIndexOutOfBoundsException(IndexOutOfBoundsException e) {
        return GlobalResponse.failure(500, "索引越界异常：" + e.getMessage());
    }

    /**
     * 捕获JSON转换异常
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public GlobalResponse<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return GlobalResponse.failure(400, "JSON转换异常：" + e.getMessage());
    }

    /**
     * 捕获@Validated验证失败异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public GlobalResponse<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return GlobalResponse.failure(400, "参数校验失败：" + Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }

    /**
     * 捕获BindException验证失败异常
     */
    @ExceptionHandler(BindException.class)
    public GlobalResponse<?> handleBindException(BindException e) {
        return GlobalResponse.failure(400, "参数校验失败：" + Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }
}