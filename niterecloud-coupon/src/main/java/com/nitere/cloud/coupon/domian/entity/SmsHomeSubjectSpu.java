package com.nitere.cloud.coupon.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sms_home_subject_spu")
public class SmsHomeSubjectSpu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "sort")
    private Integer sort;
}
