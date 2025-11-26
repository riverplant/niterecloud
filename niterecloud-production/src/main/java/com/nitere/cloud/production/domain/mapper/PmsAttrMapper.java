package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsAttrDto;
import com.nitere.cloud.production.domain.entity.PmsAttr;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsAttrMapper {

    PmsAttrDto toDto(PmsAttr entity);

    PmsAttr toEntity(PmsAttrDto dto);

    List<PmsAttrDto> toDtoList(List<PmsAttr> entities);
}
