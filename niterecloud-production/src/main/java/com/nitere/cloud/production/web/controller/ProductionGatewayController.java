package com.nitere.cloud.production.web.controller;

import com.nitere.cloud.commons.domain.ResultData;
import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.service.BrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ProductionGatewayController {
    private final BrandService brandService;

    // Resilience4j ratelimit
    @GetMapping(value = "/production/gateway/get/{id}")
    public ResultData<BrandDto> myGateway(@PathVariable("id") Long id) {

        return ResultData.success(brandService.getById(id));
    }

    @GetMapping(value = "/production/gateway/info")
    public ResultData<String> myGatewayInfo() {

        return ResultData.success("gateway info test: " + UUID.randomUUID());
    }
}
