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
public class SmsSpuBoundsDto {

    private Long id;
    private Long spuId;
    private BigDecimal growBounds;
    private BigDecimal buyBounds;
    private Integer work;
}
