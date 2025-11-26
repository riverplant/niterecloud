package com.nitere.cloud.member.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberCollectSpuDto {

    private Long id;
    private Long memberId;
    private Long spuId;
    private String spuName;
    private String spuImg;
    private LocalDateTime createTime;
}
