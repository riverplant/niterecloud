package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsAttrDto {

    private Long attrId;
    private String attrName;
    private Integer searchType;
    private Integer valueType;
    private String icon;
    private String valueSelect;
    private Integer attrType;
    private Long enable;
    private Long catelogId;
    private Integer showDesc;
}
