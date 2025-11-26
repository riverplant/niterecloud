package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sms_coupon_spu_relation")
public class SmsCouponSpuRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "spu_name", length = 255)
    private String spuName;
}
