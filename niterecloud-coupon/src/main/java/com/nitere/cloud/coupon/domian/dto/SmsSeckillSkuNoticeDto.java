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
public class SmsSeckillSkuNoticeDto {

    private Long id;
    private Long memberId;
    private Long skuId;
    private Long sessionId;
    private LocalDateTime subcribeTime;
    private LocalDateTime sendTime;
    private Integer noticeType;
}
