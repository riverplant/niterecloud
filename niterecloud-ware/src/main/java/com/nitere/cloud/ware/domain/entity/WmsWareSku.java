package com.nitere.cloud.ware.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "wms_ware_sku")
public class WmsWareSku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "sku_name", length = 200)
    private String skuName;

    @Column(name = "stock_locked")
    private Integer stockLocked;
}
