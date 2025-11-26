package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ums_member_login_log")
public class UmsMemberLoginLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "ip", length = 64)
    private String ip;

    @Column(name = "city", length = 64)
    private String city;

    @Column(name = "login_type")
    private Integer loginType;
}
