package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsSkuImagesDto {

    private Long id;
    private Long skuId;
    private String imgUrl;
    private Integer imgSort;
    private Integer defaultImg;
}
