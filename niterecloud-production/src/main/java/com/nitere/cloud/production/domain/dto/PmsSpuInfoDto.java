package com.nitere.cloud.production.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PmsSpuInfoDto {

    private Long id;
    private String spuName;
    private String spuDescription;
    private Long catalogId;
    private Long brandId;
    private BigDecimal weight;
    private Integer publishStatus;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
