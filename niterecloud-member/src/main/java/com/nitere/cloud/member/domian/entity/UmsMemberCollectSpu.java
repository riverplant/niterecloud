package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ums_member_collect_spu")
public class UmsMemberCollectSpu {

    @Id
    // DDL 裡沒寫 auto_increment，如果你之後改成自增，可以加 @GeneratedValue
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "spu_name", length = 500)
    private String spuName;

    @Column(name = "spu_img", length = 500)
    private String spuImg;

    @Column(name = "create_time")
    private LocalDateTime createTime;
}
