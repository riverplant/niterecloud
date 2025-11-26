package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderReturnApplyDto {

    private Long id;
    private Long orderId;
    private Long skuId;
    private String orderSn;
    private LocalDateTime createTime;
    private String memberUsername;
    private BigDecimal returnAmount;
    private String returnName;
    private String returnPhone;
    private Integer status;
    private LocalDateTime handleTime;
    private String skuImg;
    private String skuName;
    private String skuBrand;
    private String skuAttrsVals;
    private Integer skuCount;
    private BigDecimal skuPrice;
    private BigDecimal skuRealPrice;
    private String reason;
    private String description;
    private String descPics;
    private String handleNote;
    private String handleMan;
    private String receiveMan;
    private LocalDateTime receiveTime;
    private String receiveNote;
    private String receivePhone;
    private String companyAddress;
}
