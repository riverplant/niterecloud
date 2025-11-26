package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsCategoryBrandRelationDto {

    private Long id;
    private Long brandId;
    private Long catelogId;
    private String brandName;
    private String catelogName;
}
