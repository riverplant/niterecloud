package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsPaymentInfoDto;
import com.nitere.cloud.order.domain.entity.OmsPaymentInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsPaymentInfoMapper {

    OmsPaymentInfoDto toDto(OmsPaymentInfo entity);

    OmsPaymentInfo toEntity(OmsPaymentInfoDto dto);

    List<OmsPaymentInfoDto> toDtoList(List<OmsPaymentInfo> entities);
}
