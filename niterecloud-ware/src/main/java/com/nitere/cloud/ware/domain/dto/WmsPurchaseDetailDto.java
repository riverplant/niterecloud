package com.nitere.cloud.ware.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WmsPurchaseDetailDto {

    private Long id;
    private Long purchaseId;
    private Long skuId;
    private Integer skuNum;
    private BigDecimal skuPrice;
    private Long wareId;
    private Integer status;
}
