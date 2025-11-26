package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ums_growth_change_history")
public class UmsGrowthChangeHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "change_count")
    private Integer changeCount;

    @Column(name = "note")
    private String note;

    @Column(name = "source_type")
    private Integer sourceType;
}
