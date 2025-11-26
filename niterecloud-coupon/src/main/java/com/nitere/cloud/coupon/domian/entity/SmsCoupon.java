package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sms_coupon")
public class SmsCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "coupon_type")
    private Integer couponType;

    @Column(name = "coupon_img", length = 2000)
    private String couponImg;

    @Column(name = "coupon_name", length = 100)
    private String couponName;

    @Column(name = "num")
    private Integer num;

    @Column(name = "amount", precision = 18, scale = 4)
    private BigDecimal amount;

    @Column(name = "per_limit")
    private Integer perLimit;

    @Column(name = "min_point", precision = 18, scale = 4)
    private BigDecimal minPoint;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "use_type")
    private Integer useType;

    @Column(name = "note", length = 200)
    private String note;

    @Column(name = "publish_count")
    private Integer publishCount;

    @Column(name = "use_count")
    private Integer useCount;

    @Column(name = "receive_count")
    private Integer receiveCount;

    @Column(name = "enable_start_time")
    private LocalDateTime enableStartTime;

    @Column(name = "enable_end_time")
    private LocalDateTime enableEndTime;

    @Column(name = "code", length = 64)
    private String code;

    @Column(name = "member_level")
    private Integer memberLevel;

    @Column(name = "publish")
    private Integer publish;
}
