package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "sms_sku_ladder")
public class SmsSkuLadder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "full_count")
    private Integer fullCount;

    @Column(name = "discount", precision = 4, scale = 2)
    private BigDecimal discount;

    @Column(name = "price", precision = 18, scale = 4)
    private BigDecimal price;

    @Column(name = "add_other")
    private Integer addOther;
}
