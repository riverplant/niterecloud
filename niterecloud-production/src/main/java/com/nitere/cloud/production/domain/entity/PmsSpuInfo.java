package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_spu_info")
public class PmsSpuInfo extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "spu_name", length = 200)
    private String spuName;

    @Column(name = "spu_description", length = 1000)
    private String spuDescription;

    @Column(name = "catalog_id")
    private Long catalogId;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "weight", precision = 18, scale = 4)
    private BigDecimal weight;

    @Column(name = "publish_status")
    private Integer publishStatus;

    // getters / setters
}
