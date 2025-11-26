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
public class SmsSkuLadderDto {

    private Long id;
    private Long skuId;
    private Integer fullCount;
    private BigDecimal discount;
    private BigDecimal price;
    private Integer addOther;
}
