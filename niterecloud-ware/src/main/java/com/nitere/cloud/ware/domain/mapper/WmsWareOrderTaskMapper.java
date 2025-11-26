package com.nitere.cloud.ware.domain.mapper;

import com.nitere.cloud.ware.domain.dto.WmsWareOrderTaskDto;
import com.nitere.cloud.ware.domain.entity.WmsWareOrderTask;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WmsWareOrderTaskMapper {

    WmsWareOrderTaskDto toDto(WmsWareOrderTask entity);

    WmsWareOrderTask toEntity(WmsWareOrderTaskDto dto);

    List<WmsWareOrderTaskDto> toDtoList(List<WmsWareOrderTask> entities);
}
