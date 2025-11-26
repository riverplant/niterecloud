package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsOrderReturnApplyDto;
import com.nitere.cloud.order.domain.entity.OmsOrderReturnApply;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsOrderReturnApplyMapper {

    OmsOrderReturnApplyDto toDto(OmsOrderReturnApply entity);

    OmsOrderReturnApply toEntity(OmsOrderReturnApplyDto dto);

    List<OmsOrderReturnApplyDto> toDtoList(List<OmsOrderReturnApply> entities);
}
