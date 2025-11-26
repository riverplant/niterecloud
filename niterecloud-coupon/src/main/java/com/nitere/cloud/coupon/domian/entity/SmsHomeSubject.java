package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sms_home_subject")
public class SmsHomeSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "sub_title", length = 255)
    private String subTitle;

    @Column(name = "status")
    private Integer status;

    @Column(name = "url", length = 500)
    private String url;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "img", length = 500)
    private String img;
}
