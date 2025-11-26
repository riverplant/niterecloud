package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sms_seckill_sku_notice")
public class SmsSeckillSkuNotice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "session_id")
    private Long sessionId;

    @Column(name = "subcribe_time")
    private LocalDateTime subcribeTime;

    @Column(name = "send_time")
    private LocalDateTime sendTime;

    @Column(name = "notice_type")
    private Integer noticeType;
}
