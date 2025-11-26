package com.nitere.cloud.ware.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WmsWareOrderTaskDetailDto {

    private Long id;
    private Long skuId;
    private String skuName;
    private Integer skuNum;
    private Long taskId;
}
