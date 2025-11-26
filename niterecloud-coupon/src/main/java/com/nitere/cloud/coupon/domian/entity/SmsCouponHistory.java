package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sms_coupon_history")
public class SmsCouponHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "member_nick_name", length = 64)
    private String memberNickName;

    @Column(name = "get_type")
    private Integer getType;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "use_type")
    private Integer useType;

    @Column(name = "use_time")
    private LocalDateTime useTime;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_sn")
    private Long orderSn;
}
