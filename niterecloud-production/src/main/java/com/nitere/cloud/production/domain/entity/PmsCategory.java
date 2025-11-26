package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_category")
public class PmsCategory extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Long catId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "parent_cid")
    private Long parentCid;

    @Column(name = "cat_level")
    private Integer catLevel;

    @Column(name = "show_status")
    private Integer showStatus;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "icon", length = 255)
    private String icon;

    @Column(name = "product_unit", length = 50)
    private String productUnit;

    @Column(name = "product_count")
    private Integer productCount;

    // getters / setters
}
