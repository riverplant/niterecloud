package com.nitere.cloud.production.web.controller;

import com.nitere.cloud.commons.domain.ResultData;
import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.service.BrandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/brand")
@Slf4j
@RequiredArgsConstructor
@Tag(name = "品牌微服務模塊", description = "品牌CRUD")
public class BrandController {
    private final BrandService brandService;
    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/add")
    @Operation(summary = "新增", description = "新增品牌方法，json參數")
    public ResultData<BrandDto> addBrand(@RequestBody BrandDto brandDto) {

        BrandDto brandDto1 = brandService.create(brandDto);
        log.info("新增品牌 id={}", brandDto1.getId());
        return ResultData.success(brandDto1);
    }

    @DeleteMapping(value = "/del/{id}")
    @Operation(summary = "刪除", description = "刪除品牌方法，接受品牌ID")
    public ResultData<Map<String, Long>> deleteBrand(@PathVariable("id") Long id) {
        brandService.delete(id);
        log.info("刪除品牌 id={}", id);
        Map<String, Long> body = Collections.singletonMap("id", id);
        return ResultData.success(body);
    }

    @PutMapping(value = "/update")
    @Operation(summary = "修改", description = "修改品牌方法，接受JSON參數")
    public ResultData<BrandDto> updateBrand(@RequestBody BrandDto brandDto) {
        BrandDto update = brandService.update(brandDto.getId(), brandDto);
        log.info("修改品牌 id={}", update.getId());
        return ResultData.success(update);
    }

    @GetMapping(value = "/get/{id}")
    @Operation(summary = "按照ID查詢", description = "按照ID查詢")
    public ResultData<BrandDto> getById(@PathVariable("id") Long id) {
        return ResultData.success(brandService.getById(id));
    }

    @GetMapping(value = "/list")
    @Operation(summary = "分頁查詢", description = "分頁查詢所有品牌")
    public ResultData<Page<BrandDto>> getList(@RequestParam(defaultValue = "1") int page,
                                              @RequestParam(defaultValue = "10") int size) {
        return ResultData.success(brandService.pageBrands(page, size));
    }

    @GetMapping(value = "/consul/get/info")
    public ResultData<Map<String, String>> getInfoByConsul(@Value("${nitere.cloud.info}") String info, @Value("${nitere.cloud.version}") String version) {
        Map<String, String> reslut = new HashMap<>();
        reslut.put("info", info);
        reslut.put("port", port);
        reslut.put("version", version);
        return ResultData.success(reslut);
    }
}
