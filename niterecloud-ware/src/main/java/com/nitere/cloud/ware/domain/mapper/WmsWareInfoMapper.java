package com.nitere.cloud.ware.domain.mapper;

import com.nitere.cloud.ware.domain.dto.WmsWareInfoDto;
import com.nitere.cloud.ware.domain.entity.WmsWareInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WmsWareInfoMapper {

    WmsWareInfoDto toDto(WmsWareInfo entity);

    WmsWareInfo toEntity(WmsWareInfoDto dto);

    List<WmsWareInfoDto> toDtoList(List<WmsWareInfo> entities);
}
