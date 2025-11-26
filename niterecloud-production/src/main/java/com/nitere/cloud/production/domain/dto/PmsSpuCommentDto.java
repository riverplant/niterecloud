package com.nitere.cloud.production.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PmsSpuCommentDto {

    private Long id;
    private Long skuId;
    private Long spuId;
    private String spuName;
    private String memberNickName;
    private Integer star;
    private String memberIp;
    private LocalDateTime createTime;
    private Integer showStatus;
    private String spuAttributes;
    private Integer likesCount;
    private Integer replyCount;
    private String resources;
    private String content;
    private String memberIcon;
    private Integer commentType;
}
