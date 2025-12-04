package com.nitere.cloud.interviews.juc.semahpore;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class SemaphoreApplication {
    public static void main(String[] args) {
        ExternalApiClient externalApiClient = new ExternalApiClient(10, Duration.ofSeconds(2));

        ExecutorService pool = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 30; i++) {
            int id = i;
            pool.submit(()->{
                try {
                    String resp = externalApiClient.callExternal("req-" + id);
                    log.info("Request {}", id + " success: " + resp);
                } catch (ExternalApiClient.ExternalCallRejectedException e) {
                    log.error("Request {}" , id + " rejected: " + e.getMessage());
                }
            });
        }

        pool.shutdown();
    }
}
