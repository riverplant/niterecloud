package com.nitere.cloud.ware.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WmsPurchaseDto {

    private Long id;
    private Long assigneeId;
    private String assigneeName;
    private String phone;
    private Integer priority;
    private Integer status;
    private Long wareId;
    private BigDecimal amount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
