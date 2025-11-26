package com.nitere.cloud.order.domain.mapper;


import com.nitere.cloud.order.domain.dto.OmsOrderDto;
import com.nitere.cloud.order.domain.entity.OmsOrder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsOrderMapper {

    OmsOrderDto toDto(OmsOrder entity);

    OmsOrder toEntity(OmsOrderDto dto);

    List<OmsOrderDto> toDtoList(List<OmsOrder> entities);
}
