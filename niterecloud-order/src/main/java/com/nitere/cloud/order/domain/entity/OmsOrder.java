package com.nitere.cloud.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "oms_order")
public class OmsOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "order_sn", length = 32)
    private String orderSn;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "member_username", length = 200)
    private String memberUsername;

    @Column(name = "total_amount", precision = 18, scale = 4)
    private BigDecimal totalAmount;

    @Column(name = "pay_amount", precision = 18, scale = 4)
    private BigDecimal payAmount;

    @Column(name = "freight_amount", precision = 18, scale = 4)
    private BigDecimal freightAmount;

    @Column(name = "promotion_amount", precision = 18, scale = 4)
    private BigDecimal promotionAmount;

    @Column(name = "integration_amount", precision = 18, scale = 4)
    private BigDecimal integrationAmount;

    @Column(name = "coupon_amount", precision = 18, scale = 4)
    private BigDecimal couponAmount;

    @Column(name = "discount_amount", precision = 18, scale = 4)
    private BigDecimal discountAmount;

    @Column(name = "pay_type")
    private Integer payType;

    @Column(name = "source_type")
    private Integer sourceType;

    @Column(name = "status")
    private Integer status;

    @Column(name = "delivery_company", length = 64)
    private String deliveryCompany;

    @Column(name = "delivery_sn", length = 64)
    private String deliverySn;

    @Column(name = "auto_confirm_day")
    private Integer autoConfirmDay;

    @Column(name = "integration")
    private Integer integration;

    @Column(name = "growth")
    private Integer growth;

    @Column(name = "bill_type")
    private Integer billType;

    @Column(name = "bill_header", length = 255)
    private String billHeader;

    @Column(name = "bill_content", length = 255)
    private String billContent;

    @Column(name = "bill_receiver_phone", length = 32)
    private String billReceiverPhone;

    @Column(name = "bill_receiver_email", length = 64)
    private String billReceiverEmail;

    @Column(name = "receiver_name", length = 100)
    private String receiverName;

    @Column(name = "receiver_phone", length = 32)
    private String receiverPhone;

    @Column(name = "receiver_post_code", length = 32)
    private String receiverPostCode;

    @Column(name = "receiver_province", length = 32)
    private String receiverProvince;

    @Column(name = "receiver_city", length = 32)
    private String receiverCity;

    @Column(name = "receiver_region", length = 32)
    private String receiverRegion;

    @Column(name = "receiver_detail_address", length = 200)
    private String receiverDetailAddress;

    @Column(name = "note", length = 500)
    private String note;

    @Column(name = "confirm_status")
    private Integer confirmStatus;

    @Column(name = "delete_status")
    private Integer deleteStatus;

    @Column(name = "use_integration")
    private Integer useIntegration;

    @Column(name = "payment_time")
    private LocalDateTime paymentTime;

    @Column(name = "delivery_time")
    private LocalDateTime deliveryTime;

    @Column(name = "receive_time")
    private LocalDateTime receiveTime;

    @Column(name = "comment_time")
    private LocalDateTime commentTime;

    @Column(name = "modify_time")
    private LocalDateTime modifyTime;
}
