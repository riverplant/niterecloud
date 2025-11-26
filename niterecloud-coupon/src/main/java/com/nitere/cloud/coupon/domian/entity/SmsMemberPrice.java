package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "sms_member_price")
public class SmsMemberPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "member_level_id")
    private Long memberLevelId;

    @Column(name = "member_level_name", length = 100)
    private String memberLevelName;

    @Column(name = "member_price", precision = 18, scale = 4)
    private BigDecimal memberPrice;

    @Column(name = "add_other")
    private Integer addOther;
}
