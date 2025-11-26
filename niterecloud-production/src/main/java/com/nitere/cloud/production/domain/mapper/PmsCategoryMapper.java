package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsCategoryDto;
import com.nitere.cloud.production.domain.entity.PmsCategory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsCategoryMapper {

    PmsCategoryDto toDto(PmsCategory entity);

    PmsCategory toEntity(PmsCategoryDto dto);

    List<PmsCategoryDto> toDtoList(List<PmsCategory> entities);
}
