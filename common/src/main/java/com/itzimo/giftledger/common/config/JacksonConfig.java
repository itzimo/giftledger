package com.itzimo.giftledger.common.config;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.itzimo.giftledger.common.serializer.LocalDateTimeDeserializer;
import com.itzimo.giftledger.common.serializer.LocalDateTimeSerializer;
import com.itzimo.giftledger.common.serializer.LongToStringSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 * Jackson配置
 *
 * @author zimo
 * @date 2025/04/14
 */
@Configuration
public class JacksonConfig {
    @Bean
    public SimpleModule customModule() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(Long.class, new LongToStringSerializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        return module;
    }

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jacksonCustomizer() {
        return builder -> {
            // 设置全局时区为东八区
            builder.timeZone(TimeZone.getTimeZone("GMT+8"));
            // 其他Jackson全局配置（可选）
            builder.simpleDateFormat("yyyy-MM-dd HH:mm:ss");
        };
    }
}