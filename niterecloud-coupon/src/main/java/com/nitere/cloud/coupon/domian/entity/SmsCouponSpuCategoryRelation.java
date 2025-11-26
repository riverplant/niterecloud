package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sms_coupon_spu_category_relation")
public class SmsCouponSpuCategoryRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name", length = 64)
    private String categoryName;
}
