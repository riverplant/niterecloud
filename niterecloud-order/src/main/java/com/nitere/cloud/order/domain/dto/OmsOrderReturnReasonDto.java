package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderReturnReasonDto {

    private Long id;
    private String name;
    private Integer sort;
    private Integer status;
    private LocalDateTime createTime;
}
