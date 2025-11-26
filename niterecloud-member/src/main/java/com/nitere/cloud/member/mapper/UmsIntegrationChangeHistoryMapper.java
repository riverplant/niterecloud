package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsIntegrationChangeHistoryDto;
import com.nitere.cloud.member.domian.entity.UmsIntegrationChangeHistory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsIntegrationChangeHistoryMapper {
    UmsIntegrationChangeHistoryDto toDto(UmsIntegrationChangeHistory entity);
    UmsIntegrationChangeHistory toEntity(UmsIntegrationChangeHistoryDto dto);
    List<UmsIntegrationChangeHistoryDto> toDtoList(List<UmsIntegrationChangeHistory> entities);
}
