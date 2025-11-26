package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pms_spu_comment")
public class PmsSpuComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "spu_name")
    private String spuName;

    @Column(name = "member_nick_name")
    private String memberNickName;

    @Column(name = "star")
    private Integer star;

    @Column(name = "member_ip", length = 64)
    private String memberIp;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "show_status")
    private Integer showStatus;

    @Column(name = "spu_attributes")
    private String spuAttributes;

    @Column(name = "likes_count")
    private Integer likesCount;

    @Column(name = "reply_count")
    private Integer replyCount;

    @Column(name = "resources", length = 1000)
    private String resources;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    @Column(name = "member_icon")
    private String memberIcon;

    @Column(name = "comment_type")
    private Integer commentType;

    // getters / setters
}
