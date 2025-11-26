package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsAttrGroupDto;
import com.nitere.cloud.production.domain.entity.PmsAttrGroup;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsAttrGroupMapper {

    PmsAttrGroupDto toDto(PmsAttrGroup entity);

    PmsAttrGroup toEntity(PmsAttrGroupDto dto);

    List<PmsAttrGroupDto> toDtoList(List<PmsAttrGroup> entities);
}
