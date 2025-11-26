package com.nitere.cloud.production.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrandDto {

    private Long id;           // 對應 brandId
    private String name;
    private String logoUrl;    // 對應 logo
    private String description;// 對應 descript
    private Integer status;    // 對應 showStatus
    private String firstLetter;
    private Integer sort;
}
