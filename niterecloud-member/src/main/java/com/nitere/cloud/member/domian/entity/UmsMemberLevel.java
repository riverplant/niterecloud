package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ums_member_level")
public class UmsMemberLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "growth_point")
    private Integer growthPoint;

    @Column(name = "default_status")
    private Integer defaultStatus;

    @Column(name = "free_freight_point", precision = 18, scale = 4)
    private BigDecimal freeFreightPoint;

    @Column(name = "comment_growth_point")
    private Integer commentGrowthPoint;

    @Column(name = "priviledge_free_freight")
    private Integer priviledgeFreeFreight;

    @Column(name = "priviledge_member_price")
    private Integer priviledgeMemberPrice;

    @Column(name = "priviledge_birthday")
    private Integer priviledgeBirthday;

    @Column(name = "note", length = 255)
    private String note;
}
