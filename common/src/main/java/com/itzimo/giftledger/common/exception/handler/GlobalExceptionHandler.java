package com.itzimo.giftledger.common.exception.handler;


import com.itzimo.giftledger.common.base.Result;
import com.itzimo.giftledger.common.exception.BusinessException;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;
import java.util.Objects;

/**
 * 全局异常处理类
 *
 * @author zimo
 * @date 2025/04/14
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private final MessageSource messageSource;

    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * 捕获全局异常
     */
    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.system", new Object[]{e.getMessage()}, locale);
        return Result.fail(500, message);
    }

    /**
     * 捕获业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public Result<?> handleBusinessException(BusinessException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(e.getMessage(), null, locale);
        return Result.fail(e.getCode(), message);
    }

    /**
     * 捕获空指针异常
     */
    @ExceptionHandler(NullPointerException.class)
    public Result<?> handleNullPointerException(NullPointerException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.null.pointer", new Object[]{e.getMessage()}, locale);
        return Result.fail(500, message);
    }

    /**
     * 捕获数据库重复主键异常
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Result<?> handleDuplicateKeyException(DuplicateKeyException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.duplicate.key", new Object[]{e.getMessage()}, locale);
        return Result.fail(500, message);
    }

    /**
     * 捕获索引越界异常
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public Result<?> handleIndexOutOfBoundsException(IndexOutOfBoundsException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.index.out.of.bounds", new Object[]{e.getMessage()}, locale);
        return Result.fail(500, message);
    }

    /**
     * 捕获JSON转换异常
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Result<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.json.convert", new Object[]{e.getMessage()}, locale);
        return Result.fail(400, message);
    }

    /**
     * 捕获@Validated验证失败异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.parameter.validate", new Object[]{Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage()}, locale);
        return Result.fail(400, message);
    }

    /**
     * 捕获BindException验证失败异常
     */
    @ExceptionHandler(BindException.class)
    public Result<?> handleBindException(BindException e) {
        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage("error.parameter.validate", new Object[]{Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage()}, locale);
        return Result.fail(400, message);
    }
}