package com.nitere.cloud.order.web.controller;

import com.nitere.cloud.commons.domain.ResultData;
import com.nitere.cloud.commons.domain.dto.BrandDto;
import com.nitere.cloud.commons.web.controller.feign.ProductionFeignApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/order/feign")
public class OrderControllerFeign {

    private final ProductionFeignApi productionFeignApi;

    @PostMapping(value = "/brand/add")
    public ResultData<BrandDto> addBrand(@RequestBody BrandDto brandDto) {

        return productionFeignApi.addBrand(brandDto);
    }

    @GetMapping(value = "/brand/get/{id}")
    public ResultData<BrandDto> getById(@PathVariable("id") Long id) {
        return productionFeignApi.getById(id);
    }


    @GetMapping(value = "brand/update")
    public ResultData<BrandDto> updateBrand(@RequestBody BrandDto brandDto) {
        return productionFeignApi.updateBrand(brandDto);

    }

    @GetMapping(value = "/brand/del/{id}")
    public ResultData<Map<String, Long>> deleteBrand(@PathVariable("id") Long id) {
        return productionFeignApi.deleteBrand(id);

    }

    @GetMapping(value = "/brand/list")
    public ResultData<Page<BrandDto>> getList(@RequestParam("page") int page,
                                              @RequestParam("size") int size) {
        return productionFeignApi.getList(page, size);
    }
}
