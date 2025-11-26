package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_sku_sale_attr_value")
public class PmsSkuSaleAttrValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_name", length = 200)
    private String attrName;

    @Column(name = "attr_value", length = 200)
    private String attrValue;

    @Column(name = "attr_sort")
    private Integer attrSort;

    // getters / setters
}
