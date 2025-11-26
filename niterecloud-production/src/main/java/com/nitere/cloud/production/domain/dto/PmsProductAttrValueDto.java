package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsProductAttrValueDto {

    private Long id;
    private Long spuId;
    private Long attrId;
    private String attrName;
    private String attrValue;
    private Integer attrSort;
    private Integer quickShow;
}
