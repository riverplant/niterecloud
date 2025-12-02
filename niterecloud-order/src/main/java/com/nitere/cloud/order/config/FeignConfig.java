package com.nitere.cloud.order.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;


@Configuration
public class FeignConfig {

    @Bean
    public Retryer myRetryer() {
        // 最大請求次數為3(1+2), 初始間隔時間為100ms, 重試間隔時間為1s
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 3);
    }

    @Bean
    Logger.Level feignLoggerlevel() {
        return Logger.Level.FULL;
    }
}
