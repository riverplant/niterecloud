package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsSpuImagesDto;
import com.nitere.cloud.production.domain.entity.PmsSpuImages;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSpuImagesMapper {

    PmsSpuImagesDto toDto(PmsSpuImages entity);

    PmsSpuImages toEntity(PmsSpuImagesDto dto);

    List<PmsSpuImagesDto> toDtoList(List<PmsSpuImages> entities);
}
