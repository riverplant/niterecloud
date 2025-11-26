package com.nitere.cloud.ware.domain.mapper;

import com.nitere.cloud.ware.domain.dto.WmsPurchaseDetailDto;
import com.nitere.cloud.ware.domain.entity.WmsPurchaseDetail;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WmsPurchaseDetailMapper {

    WmsPurchaseDetailDto toDto(WmsPurchaseDetail entity);

    WmsPurchaseDetail toEntity(WmsPurchaseDetailDto dto);

    List<WmsPurchaseDetailDto> toDtoList(List<WmsPurchaseDetail> entities);
}
