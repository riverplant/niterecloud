package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderOperateHistoryDto {

    private Long id;
    private Long orderId;
    private String operateMan;
    private LocalDateTime createTime;
    private Integer orderStatus;
    private String note;
}
