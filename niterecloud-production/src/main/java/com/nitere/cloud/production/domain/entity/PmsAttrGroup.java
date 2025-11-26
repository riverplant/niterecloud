package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_attr_group")
public class PmsAttrGroup extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_group_id")
    private Long attrGroupId;

    @Column(name = "attr_group_name", length = 20)
    private String attrGroupName;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "descript")
    private String descript;

    @Column(name = "icon")
    private String icon;

    @Column(name = "catelog_id")
    private Long catelogId;

    // getters / setters
}
