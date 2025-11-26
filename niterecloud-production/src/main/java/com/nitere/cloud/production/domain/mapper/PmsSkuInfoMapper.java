package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsSkuInfoDto;
import com.nitere.cloud.production.domain.entity.PmsSkuInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSkuInfoMapper {

    PmsSkuInfoDto toDto(PmsSkuInfo entity);

    PmsSkuInfo toEntity(PmsSkuInfoDto dto);

    List<PmsSkuInfoDto> toDtoList(List<PmsSkuInfo> entities);
}
