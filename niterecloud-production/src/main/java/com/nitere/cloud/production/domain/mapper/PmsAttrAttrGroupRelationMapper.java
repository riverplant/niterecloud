package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsAttrAttrGroupRelationDto;
import com.nitere.cloud.production.domain.entity.PmsAttrAttrGroupRelation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsAttrAttrGroupRelationMapper {

    PmsAttrAttrGroupRelationDto toDto(PmsAttrAttrGroupRelation entity);

    PmsAttrAttrGroupRelation toEntity(PmsAttrAttrGroupRelationDto dto);

    List<PmsAttrAttrGroupRelationDto> toDtoList(List<PmsAttrAttrGroupRelation> entities);
}
