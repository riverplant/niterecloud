package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsAttrGroupDto {

    private Long attrGroupId;
    private String attrGroupName;
    private Integer sort;
    private String descript;
    private String icon;
    private Long catelogId;
}
