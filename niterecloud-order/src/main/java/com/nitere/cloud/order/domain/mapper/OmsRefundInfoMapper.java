package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsRefundInfoDto;
import com.nitere.cloud.order.domain.entity.OmsRefundInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsRefundInfoMapper {

    OmsRefundInfoDto toDto(OmsRefundInfo entity);

    OmsRefundInfo toEntity(OmsRefundInfoDto dto);

    List<OmsRefundInfoDto> toDtoList(List<OmsRefundInfo> entities);
}
