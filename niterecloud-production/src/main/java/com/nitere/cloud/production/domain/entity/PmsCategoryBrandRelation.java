package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_category_brand_relation")
public class PmsCategoryBrandRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "catelog_id")
    private Long catelogId;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "catelog_name")
    private String catelogName;

    // getters / setters
}
