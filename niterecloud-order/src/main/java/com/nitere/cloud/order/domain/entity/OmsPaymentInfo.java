package com.nitere.cloud.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "oms_payment_info")
public class OmsPaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_sn", length = 32)
    private String orderSn;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "alipay_trade_no", length = 50)
    private String alipayTradeNo;

    @Column(name = "total_amount", precision = 18, scale = 4)
    private BigDecimal totalAmount;

    @Column(name = "subject", length = 200)
    private String subject;

    @Column(name = "payment_status", length = 20)
    private String paymentStatus;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "confirm_time")
    private LocalDateTime confirmTime;

    @Column(name = "callback_content", length = 4000)
    private String callbackContent;

    @Column(name = "callback_time")
    private LocalDateTime callbackTime;
}
