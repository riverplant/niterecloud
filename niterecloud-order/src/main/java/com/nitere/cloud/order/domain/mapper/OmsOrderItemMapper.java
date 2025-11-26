package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsOrderItemDto;
import com.nitere.cloud.order.domain.entity.OmsOrderItem;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsOrderItemMapper {

    OmsOrderItemDto toDto(OmsOrderItem entity);

    OmsOrderItem toEntity(OmsOrderItemDto dto);

    List<OmsOrderItemDto> toDtoList(List<OmsOrderItem> entities);
}
