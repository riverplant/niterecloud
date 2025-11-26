package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_product_attr_value")
public class PmsProductAttrValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_name", length = 200)
    private String attrName;

    @Column(name = "attr_value", length = 200)
    private String attrValue;

    @Column(name = "attr_sort")
    private Integer attrSort;

    @Column(name = "quick_show")
    private Integer quickShow;

    // getters / setters
}
