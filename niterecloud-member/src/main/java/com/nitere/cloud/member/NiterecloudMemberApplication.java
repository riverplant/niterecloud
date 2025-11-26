package com.nitere.cloud.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class NiterecloudMemberApplication {
    private static final Logger LOG = LoggerFactory.getLogger(NiterecloudMemberApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(NiterecloudMemberApplication.class);
        Environment env = application.run(args).getEnvironment();
        LOG.info("啓動成功!!");
        LOG.info("address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }
}