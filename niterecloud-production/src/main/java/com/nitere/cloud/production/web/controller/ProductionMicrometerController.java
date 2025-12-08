package com.nitere.cloud.production.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class ProductionMicrometerController {
    // Resilience4j ratelimit
    @GetMapping(value = "/production/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Long id) {

        return "Hello, mmicrometer! inputId:" + id + "\t  服務返回" + UUID.randomUUID();
    }

}
