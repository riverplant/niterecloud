package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsRefundInfoDto {

    private Long id;
    private Long orderReturnId;
    private BigDecimal refund;
    private String refundSn;
    private Integer refundStatus;
    private Integer refundChannel;
    private String refundContent;
}
