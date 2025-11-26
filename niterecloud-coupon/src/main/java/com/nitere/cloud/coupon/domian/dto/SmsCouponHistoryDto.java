// DTO
package com.nitere.cloud.coupon.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsCouponHistoryDto {

    private Long id;
    private Long couponId;
    private Long memberId;
    private String memberNickName;
    private Integer getType;
    private LocalDateTime createTime;
    private Integer useType;
    private LocalDateTime useTime;
    private Long orderId;
    private Long orderSn;
}
