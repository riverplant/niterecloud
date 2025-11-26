package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsOrderReturnReasonDto;
import com.nitere.cloud.order.domain.entity.OmsOrderReturnReason;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsOrderReturnReasonMapper {

    OmsOrderReturnReasonDto toDto(OmsOrderReturnReason entity);

    OmsOrderReturnReason toEntity(OmsOrderReturnReasonDto dto);

    List<OmsOrderReturnReasonDto> toDtoList(List<OmsOrderReturnReason> entities);
}
