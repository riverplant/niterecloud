package com.nitere.cloud.ware.domain.mapper;

import com.nitere.cloud.ware.domain.dto.WmsWareOrderTaskDetailDto;
import com.nitere.cloud.ware.domain.entity.WmsWareOrderTaskDetail;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WmsWareOrderTaskDetailMapper {

    WmsWareOrderTaskDetailDto toDto(WmsWareOrderTaskDetail entity);

    WmsWareOrderTaskDetail toEntity(WmsWareOrderTaskDetailDto dto);

    List<WmsWareOrderTaskDetailDto> toDtoList(List<WmsWareOrderTaskDetail> entities);
}
