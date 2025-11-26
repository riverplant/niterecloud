package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsSpuInfoDescDto;
import com.nitere.cloud.production.domain.entity.PmsSpuInfoDesc;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSpuInfoDescMapper {

    PmsSpuInfoDescDto toDto(PmsSpuInfoDesc entity);

    PmsSpuInfoDesc toEntity(PmsSpuInfoDescDto dto);

    List<PmsSpuInfoDescDto> toDtoList(List<PmsSpuInfoDesc> entities);
}
