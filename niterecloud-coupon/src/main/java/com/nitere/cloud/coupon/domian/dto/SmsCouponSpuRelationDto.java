// DTO
package com.nitere.cloud.coupon.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsCouponSpuRelationDto {

    private Long id;
    private Long couponId;
    private Long spuId;
    private String spuName;
}
