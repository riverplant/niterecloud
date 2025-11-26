package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ums_member_receive_address")
public class UmsMemberReceiveAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "phone", length = 64)
    private String phone;

    @Column(name = "post_code", length = 64)
    private String postCode;

    @Column(name = "province", length = 100)
    private String province;

    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "region", length = 100)
    private String region;

    @Column(name = "detail_address", length = 255)
    private String detailAddress;

    @Column(name = "areacode", length = 15)
    private String areaCode;

    @Column(name = "default_status")
    private Integer defaultStatus;
}
