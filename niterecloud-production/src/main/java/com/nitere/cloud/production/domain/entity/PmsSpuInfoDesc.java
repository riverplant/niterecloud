package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_spu_info_desc")
public class PmsSpuInfoDesc {

    @Id
    @Column(name = "spu_id")
    private Long spuId;   // 注意：這個表的主鍵不是自增

    @Lob
    @Column(name = "decript")
    private String decript;

    // getters / setters
}
