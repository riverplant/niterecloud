package com.nitere.cloud.order.domain.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OmsOrderItemDto {

    private Long id;
    private Long orderId;
    private String orderSn;
    private Long spuId;
    private String spuName;
    private String spuPic;
    private String spuBrand;
    private Long categoryId;
    private Long skuId;
    private String skuName;
    private String skuPic;
    private BigDecimal skuPrice;
    private Integer skuQuantity;
    private String skuAttrsVals;
    private BigDecimal promotionAmount;
    private BigDecimal couponAmount;
    private BigDecimal integrationAmount;
    private BigDecimal realAmount;
    private Integer giftIntegration;
    private Integer giftGrowth;
}
