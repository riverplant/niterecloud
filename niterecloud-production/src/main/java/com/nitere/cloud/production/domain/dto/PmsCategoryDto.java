package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsCategoryDto {

    private Long catId;
    private String name;
    private Long parentCid;
    private Integer catLevel;
    private Integer showStatus;
    private Integer sort;
    private String icon;
    private String productUnit;
    private Integer productCount;
}
