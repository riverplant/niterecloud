package com.nitere.cloud.production.domain.mapper;


import com.nitere.cloud.production.domain.dto.PmsSpuInfoDto;
import com.nitere.cloud.production.domain.entity.PmsSpuInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSpuInfoMapper {

    PmsSpuInfoDto toDto(PmsSpuInfo entity);

    PmsSpuInfo toEntity(PmsSpuInfoDto dto);

    List<PmsSpuInfoDto> toDtoList(List<PmsSpuInfo> entities);
}
