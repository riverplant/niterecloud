// DTO
package com.nitere.cloud.coupon.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsSkuFullReductionDto {

    private Long id;
    private Long skuId;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer addOther;
}
