package com.itzimo.giftledger.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * spring上下文util
 *
 * @author zimo
 * @date 2025/04/17
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringContextUtil.class);

    // 使用 volatile 确保线程安全
    private static volatile ApplicationContext applicationContext;

    /**
     * 获取 Spring 容器中的 Bean
     *
     * @param clazz Bean 实例对象
     * @param <T>   Bean 类型
     * @return Bean 实例
     */
    public static <T> T getBean(Class<T> clazz) {
        if (applicationContext == null) {
            throw new IllegalStateException("ApplicationContext is not initialized.");
        }
        return applicationContext.getBean(clazz);
    }

    /**
     * 获取配置文件中的属性值
     *
     * @param key 属性键
     * @return 属性值
     */
    public static String getProperty(String key) {
        if (applicationContext == null) {
            throw new IllegalStateException("ApplicationContext is not initialized.");
        }
        Environment environment = applicationContext.getEnvironment();
        return environment.getProperty(key);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
        logger.info("ApplicationContext initialized successfully.");
    }
}