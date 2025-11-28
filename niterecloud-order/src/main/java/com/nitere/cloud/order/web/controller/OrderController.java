package com.nitere.cloud.order.web.controller;

import com.nitere.cloud.commons.domain.ResultData;
import com.nitere.cloud.order.domain.dto.BrandDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {

    public static final String productionSrv_URL = "http://nitere-cloud-production";
    private final RestTemplate restTemplate;

    @PostMapping(value = "/brand/add")
    public ResultData<BrandDto> addBrand(@RequestBody BrandDto brandDto) {

        var exchange =
                restTemplate.exchange(
                        productionSrv_URL + "/brand/add",
                        HttpMethod.POST,
                        new HttpEntity<>(brandDto),
                        new ParameterizedTypeReference<ResultData<BrandDto>>() {
                        }
                );
        return exchange.getBody();
    }

    @GetMapping(value = "/brand/get/{id}")

    public ResultData<BrandDto> getById(@PathVariable("id") Long id) {
        var exchange =
                restTemplate.exchange(
                        productionSrv_URL + "/brand/get/{id}",
                        HttpMethod.GET,
                        HttpEntity.EMPTY,
                        new ParameterizedTypeReference<ResultData<BrandDto>>() {},
                        id
                );
        return exchange.getBody();
    }

}
