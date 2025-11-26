package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_spu_images")
public class PmsSpuImages extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "spu_id")
    private Long spuId;

    @Column(name = "img_name", length = 200)
    private String imgName;

    @Column(name = "img_url", length = 255)
    private String imgUrl;

    @Column(name = "img_sort")
    private Integer imgSort;

    @Column(name = "default_img")
    private Integer defaultImg;

    // getters / setters
}
