package com.nitere.cloud.coupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@RefreshScope
@ComponentScan(basePackages = "com.nitere.cloud")
@EnableDiscoveryClient
public class NitereCloudCouponApplication {
    private static final Logger LOG = LoggerFactory.getLogger(NitereCloudCouponApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(NitereCloudCouponApplication.class);
        Environment env = application.run(args).getEnvironment();
        LOG.info("啓動成功!!");
        LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }
}