package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsSkuSaleAttrValueDto {

    private Long id;
    private Long skuId;
    private Long attrId;
    private String attrName;
    private String attrValue;
    private Integer attrSort;
}
