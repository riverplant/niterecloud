package com.nitere.cloud.ware.domain.mapper;

import com.nitere.cloud.ware.domain.dto.WmsWareSkuDto;
import com.nitere.cloud.ware.domain.entity.WmsWareSku;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WmsWareSkuMapper {

    WmsWareSkuDto toDto(WmsWareSku entity);

    WmsWareSku toEntity(WmsWareSkuDto dto);

    List<WmsWareSkuDto> toDtoList(List<WmsWareSku> entities);
}
