package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsProductAttrValueDto;
import com.nitere.cloud.production.domain.entity.PmsProductAttrValue;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsProductAttrValueMapper {

    PmsProductAttrValueDto toDto(PmsProductAttrValue entity);

    PmsProductAttrValue toEntity(PmsProductAttrValueDto dto);

    List<PmsProductAttrValueDto> toDtoList(List<PmsProductAttrValue> entities);
}
