package com.nitere.cloud.order.domain.mapper;

import com.nitere.cloud.order.domain.dto.OmsOrderOperateHistoryDto;
import com.nitere.cloud.order.domain.entity.OmsOrderOperateHistory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OmsOrderOperateHistoryMapper {

    OmsOrderOperateHistoryDto toDto(OmsOrderOperateHistory entity);

    OmsOrderOperateHistory toEntity(OmsOrderOperateHistoryDto dto);

    List<OmsOrderOperateHistoryDto> toDtoList(List<OmsOrderOperateHistory> entities);
}
