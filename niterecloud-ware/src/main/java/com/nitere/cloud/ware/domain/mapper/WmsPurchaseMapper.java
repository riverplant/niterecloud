package com.nitere.cloud.ware.domain.mapper;

import com.nitere.cloud.ware.domain.dto.WmsPurchaseDto;
import com.nitere.cloud.ware.domain.entity.WmsPurchase;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WmsPurchaseMapper {

    WmsPurchaseDto toDto(WmsPurchase entity);

    WmsPurchase toEntity(WmsPurchaseDto dto);

    List<WmsPurchaseDto> toDtoList(List<WmsPurchase> entities);
}
