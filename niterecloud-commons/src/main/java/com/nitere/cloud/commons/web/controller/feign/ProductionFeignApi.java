package com.nitere.cloud.commons.web.controller.feign;

import com.nitere.cloud.commons.domain.ResultData;
import com.nitere.cloud.commons.domain.dto.BrandDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient("nitere-cloud-production")
public interface ProductionFeignApi {

    @PostMapping(value = "/brand/add")
    @Operation(summary = "新增", description = "新增品牌方法，json參數")
    ResultData<BrandDto> addBrand(@RequestBody BrandDto brandDto);

    @DeleteMapping(value = "/brand/del/{id}")
    @Operation(summary = "刪除", description = "刪除品牌方法，接受品牌ID")
    ResultData<Map<String, Long>> deleteBrand(@PathVariable("id") Long id);

    @PutMapping(value = "/brand/update")
    @Operation(summary = "修改", description = "修改品牌方法，接受JSON參數")
    ResultData<BrandDto> updateBrand(@RequestBody BrandDto brandDto);

    @GetMapping(value = "/brand/get/{id}")
    @Operation(summary = "按照ID查詢", description = "按照ID查詢")
    ResultData<BrandDto> getById(@PathVariable("id") Long id);

    @GetMapping(value = "/brand/list")
    @Operation(summary = "分頁查詢", description = "分頁查詢所有品牌")
    ResultData<Page<BrandDto>> getList(@RequestParam("page") Integer page,
                                       @RequestParam("size") Integer size);


    @GetMapping(value = "/brand/retry")
    ResultData<BrandDto> retry() ;
}
