package com.nitere.cloud.production.domain.entity;

import com.nitere.cloud.commons.domain.DomainImpl;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pms_brand")
@Schema(title = "品牌表實體類")
public class PmsBrand  extends DomainImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    @Schema(title = "主鍵")
    private Long brandId;

    @Column(name = "name", length = 50)
    @Schema(title = "品牌名稱")
    private String name;

    @Column(name = "logo", length = 2000)
    @Schema(title = "品牌logo")
    private String logo;

    @Lob
    @Column(name = "descript")
    @Schema(title = "品牌描述")
    private String descript;

    @Column(name = "show_status")
    @Schema(title = "品牌上綫狀態")
    private Integer showStatus;

    @Column(name = "first_letter", length = 1)
    @Schema(title = "品牌首字母")
    private String firstLetter;

    @Column(name = "sort")
    @Schema(title = "品牌序列號")
    private Integer sort;

    // getters / setters
}
