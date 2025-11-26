package com.nitere.cloud.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "oms_order_item")
public class OmsOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_sn", length = 32)
    private String orderSn;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "spu_name", length = 255)
    private String spuName;

    @Column(name = "spu_pic", length = 500)
    private String spuPic;

    @Column(name = "spu_brand", length = 200)
    private String spuBrand;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "sku_name", length = 255)
    private String skuName;

    @Column(name = "sku_pic", length = 500)
    private String skuPic;

    @Column(name = "sku_price", precision = 18, scale = 4)
    private BigDecimal skuPrice;

    @Column(name = "sku_quantity")
    private Integer skuQuantity;

    @Column(name = "sku_attrs_vals", length = 500)
    private String skuAttrsVals;

    @Column(name = "promotion_amount", precision = 18, scale = 4)
    private BigDecimal promotionAmount;

    @Column(name = "coupon_amount", precision = 18, scale = 4)
    private BigDecimal couponAmount;

    @Column(name = "integration_amount", precision = 18, scale = 4)
    private BigDecimal integrationAmount;

    @Column(name = "real_amount", precision = 18, scale = 4)
    private BigDecimal realAmount;

    @Column(name = "gift_integration")
    private Integer giftIntegration;

    @Column(name = "gift_growth")
    private Integer giftGrowth;
}
