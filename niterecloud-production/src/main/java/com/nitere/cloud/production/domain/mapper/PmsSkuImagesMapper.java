package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsSkuImagesDto;
import com.nitere.cloud.production.domain.entity.PmsSkuImages;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSkuImagesMapper {

    PmsSkuImagesDto toDto(PmsSkuImages entity);

    PmsSkuImages toEntity(PmsSkuImagesDto dto);

    List<PmsSkuImagesDto> toDtoList(List<PmsSkuImages> entities);
}
