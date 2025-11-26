package com.nitere.cloud.member.mapper;


import com.nitere.cloud.member.domian.dto.UmsGrowthChangeHistoryDto;
import com.nitere.cloud.member.domian.entity.UmsGrowthChangeHistory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsGrowthChangeHistoryMapper {
    UmsGrowthChangeHistoryDto toDto(UmsGrowthChangeHistory entity);

    UmsGrowthChangeHistory toEntity(UmsGrowthChangeHistoryDto dto);

    List<UmsGrowthChangeHistoryDto> toDtoList(List<UmsGrowthChangeHistory> entities);
}
