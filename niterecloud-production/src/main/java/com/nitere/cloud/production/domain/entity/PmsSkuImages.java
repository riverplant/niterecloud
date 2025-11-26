package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_sku_images")
public class PmsSkuImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "img_sort")
    private Integer imgSort;

    @Column(name = "default_img")
    private Integer defaultImg;

    // getters / setters
}
