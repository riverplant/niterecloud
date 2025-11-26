package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsPaymentInfoDto {

    private Long id;
    private String orderSn;
    private Long orderId;
    private String alipayTradeNo;
    private BigDecimal totalAmount;
    private String subject;
    private String paymentStatus;
    private LocalDateTime createTime;
    private LocalDateTime confirmTime;
    private String callbackContent;
    private LocalDateTime callbackTime;
}
