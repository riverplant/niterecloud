package com.nitere.cloud.ware.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "wms_purchase_detail")
public class WmsPurchaseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "purchase_id")
    private Long purchaseId;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "sku_num")
    private Integer skuNum;

    @Column(name = "sku_price", precision = 18, scale = 4)
    private BigDecimal skuPrice;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "status")
    private Integer status;
}
