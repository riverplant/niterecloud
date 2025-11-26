package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsSpuImagesDto {

    private Long id;
    private Long spuId;
    private String imgName;
    private String imgUrl;
    private Integer imgSort;
    private Integer defaultImg;
}
