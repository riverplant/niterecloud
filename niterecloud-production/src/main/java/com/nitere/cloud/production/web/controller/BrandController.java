package com.nitere.cloud.production.web.controller;

import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.service.BrandService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
@Slf4j
@RequiredArgsConstructor
@Tag(name = "品牌微服務模塊", description = "品牌CRUD")
public class BrandController {
    private final BrandService brandService;

    @PostMapping(value = "/add")
    @Operation(summary = "新增", description = "新增品牌方法，json參數")
    public BrandDto addBrand(@RequestBody BrandDto brandDto) {

        BrandDto brandDto1 = brandService.create(brandDto);
        log.info("新增品牌 id={}", brandDto1.getId());
        return brandDto1;
    }

    @DeleteMapping(value = "/del/{id}")
    @Operation(summary = "刪除", description = "刪除品牌方法，接受品牌ID")
    public void deleteBrand(@PathVariable Long id) {
        brandService.delete(id);
        log.info("刪除品牌 id={}", id);
    }

    @PutMapping(value = "/update")
    @Operation(summary = "修改", description = "修改品牌方法，接受JSON參數")
    public BrandDto updateBrand(@RequestBody BrandDto brandDto) {
        BrandDto update = brandService.update(brandDto.getId(), brandDto);
        log.info("修改品牌 id={}", update.getId());
        return update;
    }

    @GetMapping(value = "/get/{id}")
    @Operation(summary = "按照ID查詢", description = "按照ID查詢")
    public BrandDto getById(@PathVariable Long id) {
        return brandService.getById(id);
    }

    @GetMapping(value = "/list")
    @Operation(summary = "分頁查詢", description = "分頁查詢所有品牌")
    public Page<BrandDto> getList(@RequestParam(defaultValue = "1") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        return brandService.pageBrands(page, size);
    }


}
