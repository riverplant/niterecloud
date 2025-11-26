package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsSkuSaleAttrValueDto;
import com.nitere.cloud.production.domain.entity.PmsSkuSaleAttrValue;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSkuSaleAttrValueMapper {

    PmsSkuSaleAttrValueDto toDto(PmsSkuSaleAttrValue entity);

    PmsSkuSaleAttrValue toEntity(PmsSkuSaleAttrValueDto dto);

    List<PmsSkuSaleAttrValueDto> toDtoList(List<PmsSkuSaleAttrValue> entities);
}
