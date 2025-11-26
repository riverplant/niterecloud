package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_brand")
public class PmsBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "logo", length = 2000)
    private String logo;

    @Lob
    @Column(name = "descript")
    private String descript;

    @Column(name = "show_status")
    private Integer showStatus;

    @Column(name = "first_letter", length = 1)
    private String firstLetter;

    @Column(name = "sort")
    private Integer sort;

    // getters / setters
}
