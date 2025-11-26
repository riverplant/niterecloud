package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsOrderSettingDto;
import com.nitere.cloud.order.domain.entity.OmsOrderSetting;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsOrderSettingMapper {

    OmsOrderSettingDto toDto(OmsOrderSetting entity);

    OmsOrderSetting toEntity(OmsOrderSettingDto dto);

    List<OmsOrderSettingDto> toDtoList(List<OmsOrderSetting> entities);
}
