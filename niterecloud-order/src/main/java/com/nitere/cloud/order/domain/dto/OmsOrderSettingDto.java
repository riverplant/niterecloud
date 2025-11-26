package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderSettingDto {

    private Long id;
    private Integer flashOrderOvertime;
    private Integer normalOrderOvertime;
    private Integer confirmOvertime;
    private Integer finishOvertime;
    private Integer commentOvertime;
    private Integer memberLevel;
}
