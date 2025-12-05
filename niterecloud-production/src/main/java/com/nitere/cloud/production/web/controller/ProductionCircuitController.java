package com.nitere.cloud.production.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class ProductionCircuitController {

    @GetMapping(value = "/production/circuit/{id}")
    public String myCircuit(@PathVariable("id") Long id) {

        if (id == -4) throw new RuntimeException("------circuit id 不能為負數");

        if (id == 9999) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // 恢復中斷狀態（正確處理 InterruptedException）
                Thread.currentThread().interrupt();
                // 用 logging 記錄錯誤
                log.warn("Thread was interrupted while simulating delay", e);
            }

        }

        return "Hello, circuit! inputId:" + id + "\t" + UUID.randomUUID();
    }

    // Resilience4j ratelimit
    @GetMapping(value = "/production/ratelimit/{id}")
    public String myRatelimit(@PathVariable("id") Long id) {

        return "Hello, ratelimit! inputId:" + id + "\t" + UUID.randomUUID();
    }


}
