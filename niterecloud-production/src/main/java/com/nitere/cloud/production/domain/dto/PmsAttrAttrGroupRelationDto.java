package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsAttrAttrGroupRelationDto {

    private Long id;
    private Long attrId;
    private Long attrGroupId;
    private Integer attrSort;
}
