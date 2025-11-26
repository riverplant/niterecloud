package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "sms_sku_full_reduction")
public class SmsSkuFullReduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "full_price", precision = 18, scale = 4)
    private BigDecimal fullPrice;

    @Column(name = "reduce_price", precision = 18, scale = 4)
    private BigDecimal reducePrice;

    @Column(name = "add_other")
    private Integer addOther;
}
