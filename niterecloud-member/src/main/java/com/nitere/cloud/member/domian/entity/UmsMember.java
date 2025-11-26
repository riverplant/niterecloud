package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ums_member")
public class UmsMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "level_id")
    private Long levelId;

    @Column(name = "username", length = 64)
    private String username;

    @Column(name = "password", length = 64)
    private String password;

    @Column(name = "nickname", length = 64)
    private String nickname;

    @Column(name = "mobile", length = 20)
    private String mobile;

    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "header", length = 500)
    private String header;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "birth")
    private LocalDate birth;

    @Column(name = "city", length = 500)
    private String city;

    @Column(name = "job", length = 255)
    private String job;

    @Column(name = "sign", length = 255)
    private String sign;

    @Column(name = "source_type")
    private Integer sourceType;

    @Column(name = "integration")
    private Integer integration;

    @Column(name = "growth")
    private Integer growth;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private LocalDateTime createTime;
}
