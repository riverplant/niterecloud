package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_attr_attrgroup_relation")
public class PmsAttrAttrGroupRelation extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "attr_id")
    private Long attrId;

    @Column(name = "attr_group_id")
    private Long attrGroupId;

    @Column(name = "attr_sort")
    private Integer attrSort;

    // getters / setters
}
