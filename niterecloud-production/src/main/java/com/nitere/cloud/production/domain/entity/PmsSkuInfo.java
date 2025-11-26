package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pms_sku_info")
public class PmsSkuInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "sku_name")
    private String skuName;

    @Column(name = "sku_desc", length = 2000)
    private String skuDesc;

    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "sku_default_img")
    private String skuDefaultImg;

    @Column(name = "sku_title")
    private String skuTitle;

    @Column(name = "sku_subtitle", length = 2000)
    private String skuSubtitle;

    @Column(name = "price", precision = 18, scale = 4)
    private BigDecimal price;

    @Column(name = "sale_count")
    private Long saleCount;

    // getters / setters
}
