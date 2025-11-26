package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "sms_seckill_sku_relation")
public class SmsSeckillSkuRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "promotion_id")
    private Long promotionId;

    @Column(name = "promotion_session_id")
    private Long promotionSessionId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "seckill_price")
    private BigDecimal seckillPrice;

    @Column(name = "seckill_count")
    private BigDecimal seckillCount;

    @Column(name = "seckill_limit")
    private BigDecimal seckillLimit;

    @Column(name = "seckill_sort")
    private Integer seckillSort;
}
