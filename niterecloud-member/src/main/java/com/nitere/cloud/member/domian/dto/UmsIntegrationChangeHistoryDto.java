package com.nitere.cloud.member.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsIntegrationChangeHistoryDto {

    private Long id;
    private Long memberId;
    private LocalDateTime createTime;
    private Integer changeCount;
    private String note;
    private Integer sourceType;
}
