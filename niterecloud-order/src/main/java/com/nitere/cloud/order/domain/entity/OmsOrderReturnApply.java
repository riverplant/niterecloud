package com.nitere.cloud.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "oms_order_return_apply")
public class OmsOrderReturnApply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "order_sn", length = 32)
    private String orderSn;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "member_username", length = 64)
    private String memberUsername;

    @Column(name = "return_amount", precision = 18, scale = 4)
    private BigDecimal returnAmount;

    @Column(name = "return_name", length = 100)
    private String returnName;

    @Column(name = "return_phone", length = 20)
    private String returnPhone;

    @Column(name = "status")
    private Integer status;

    @Column(name = "handle_time")
    private LocalDateTime handleTime;

    @Column(name = "sku_img", length = 500)
    private String skuImg;

    @Column(name = "sku_name", length = 200)
    private String skuName;

    @Column(name = "sku_brand", length = 200)
    private String skuBrand;

    @Column(name = "sku_attrs_vals", length = 500)
    private String skuAttrsVals;

    @Column(name = "sku_count")
    private Integer skuCount;

    @Column(name = "sku_price", precision = 18, scale = 4)
    private BigDecimal skuPrice;

    @Column(name = "sku_real_price", precision = 18, scale = 4)
    private BigDecimal skuRealPrice;

    @Column(name = "reason", length = 200)
    private String reason;

    // 原表名為 description述，這裡正常命名，靠 @Column 對應
    @Column(name = "description述", length = 500)
    private String description;

    @Column(name = "desc_pics", length = 2000)
    private String descPics;

    @Column(name = "handle_note", length = 500)
    private String handleNote;

    @Column(name = "handle_man", length = 200)
    private String handleMan;

    @Column(name = "receive_man", length = 100)
    private String receiveMan;

    @Column(name = "receive_time")
    private LocalDateTime receiveTime;

    @Column(name = "receive_note", length = 500)
    private String receiveNote;

    @Column(name = "receive_phone", length = 20)
    private String receivePhone;

    @Column(name = "company_address", length = 500)
    private String companyAddress;
}
