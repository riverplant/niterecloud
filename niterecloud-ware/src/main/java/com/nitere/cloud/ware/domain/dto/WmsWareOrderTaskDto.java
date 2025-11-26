package com.nitere.cloud.ware.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WmsWareOrderTaskDto {

    private Long id;
    private Long orderId;
    private String orderSn;
    private String consignee;
    private String consigneeTel;
    private String deliveryAddress;
    private String orderComment;
    private Integer paymentWay;
    private Integer taskStatus;
    private String orderBody;
    private String trackingNo;
    private LocalDateTime createTime;
    private Long wareId;
    private String taskComment;
}
