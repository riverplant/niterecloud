package com.nitere.cloud.production.web.controller;

import com.nitere.cloud.commons.domain.ResultData;
import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.service.BrandService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Enumeration;
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

    @GetMapping(value = "/production/gateway/filter")
    public ResultData<String> myGatewayFilter(HttpServletRequest request) {
        StringBuilder result = new StringBuilder();
        Enumeration<String> headers = request.getHeaderNames();

        while (headers.hasMoreElements()) {
            String headName = headers.nextElement();
            String headValue = request.getHeader(headName);
            log.info("[myGatewayFilter] 請求頭名字；{}", headName + "\t\t\t" +
                    "values:" + headValue);

            if ("X-Request-nitere1".equalsIgnoreCase(headName)
                    || "X-Request-nitere2".equalsIgnoreCase(headName)) {
                result.append(headName).append("\t").append(headValue).append(" ");
            }
        }
        return ResultData.success("myGatewayFilter test: " + result + "\t" + LocalDateTime.now());
    }
}
