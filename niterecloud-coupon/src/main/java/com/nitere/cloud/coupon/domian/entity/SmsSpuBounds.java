package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "sms_spu_bounds")
public class SmsSpuBounds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "grow_bounds", precision = 18, scale = 4)
    private BigDecimal growBounds;

    @Column(name = "buy_bounds", precision = 18, scale = 4)
    private BigDecimal buyBounds;

    @Column(name = "work")
    private Integer work;
}
