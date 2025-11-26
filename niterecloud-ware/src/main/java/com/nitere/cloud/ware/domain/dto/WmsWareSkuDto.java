package com.nitere.cloud.ware.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WmsWareSkuDto {

    private Long id;
    private Long skuId;
    private Long wareId;
    private Integer stock;
    private String skuName;
    private Integer stockLocked;
}
