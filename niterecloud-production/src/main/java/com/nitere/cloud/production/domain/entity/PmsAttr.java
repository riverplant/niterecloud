package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_attr")
public class PmsAttr extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_name", length = 30)
    private String attrName;

    @Column(name = "search_type")
    private Integer searchType;

    @Column(name = "value_type")
    private Integer valueType;

    @Column(name = "icon", length = 255)
    private String icon;

    @Column(name = "value_select", length = 255)
    private String valueSelect;

    @Column(name = "attr_type")
    private Integer attrType;

    @Column(name = "enable")
    private Long enable;

    @Column(name = "catelog_id")
    private Long catelogId;

    @Column(name = "show_desc")
    private Integer showDesc;

    // getter / setter 省略，可用 IDE 或 Lombok 生成
}
