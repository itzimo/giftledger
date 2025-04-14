package com.itzimo.giftledger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 礼品分类帐应用程序
 *
 * @author zimo
 * @date 2025/04/13
 */
@MapperScan("com.itzimo.giftledger.mapper")
@SpringBootApplication
public class GiftLedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftLedgerApplication.class, args);
    }

}
