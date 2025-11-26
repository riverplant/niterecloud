package com.nitere.cloud.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "oms_refund_info")
public class OmsRefundInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_return_id")
    private Long orderReturnId;

    @Column(name = "refund", precision = 18, scale = 4)
    private BigDecimal refund;

    @Column(name = "refund_sn", length = 64)
    private String refundSn;

    @Column(name = "refund_status")
    private Integer refundStatus;

    @Column(name = "refund_channel")
    private Integer refundChannel;

    @Column(name = "refund_content", length = 5000)
    private String refundContent;
}
