package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ums_integration_change_history")
public class UmsIntegrationChangeHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "change_count")
    private Integer changeCount;

    @Column(name = "note", length = 255)
    private String note;

    // 表字段叫 source_tyoe，這裡用正常命名，靠 @Column 對應
    @Column(name = "source_tyoe")
    private Integer sourceType;
}
