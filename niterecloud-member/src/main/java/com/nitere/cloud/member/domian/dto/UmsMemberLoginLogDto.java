package com.nitere.cloud.member.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberLoginLogDto {

    private Long id;
    private Long memberId;
    private LocalDateTime createTime;
    private String ip;
    private String city;
    private Integer loginType;
}
