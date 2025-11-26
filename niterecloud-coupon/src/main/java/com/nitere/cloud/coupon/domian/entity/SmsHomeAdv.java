package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sms_home_adv")
public class SmsHomeAdv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "pic", length = 500)
    private String pic;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "status")
    private Integer status;

    @Column(name = "click_count")
    private Integer clickCount;

    @Column(name = "url", length = 500)
    private String url;

    @Column(name = "note", length = 500)
    private String note;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "publisher_id")
    private Long publisherId;

    @Column(name = "auth_id")
    private Long authId;
}
