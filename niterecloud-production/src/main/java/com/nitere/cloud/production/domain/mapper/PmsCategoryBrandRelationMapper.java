package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsCategoryBrandRelationDto;
import com.nitere.cloud.production.domain.entity.PmsCategoryBrandRelation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsCategoryBrandRelationMapper {

    PmsCategoryBrandRelationDto toDto(PmsCategoryBrandRelation entity);

    PmsCategoryBrandRelation toEntity(PmsCategoryBrandRelationDto dto);

    List<PmsCategoryBrandRelationDto> toDtoList(List<PmsCategoryBrandRelation> entities);
}
