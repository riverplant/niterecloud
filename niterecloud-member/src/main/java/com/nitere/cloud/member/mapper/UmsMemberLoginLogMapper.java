package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberLoginLogDto;
import com.nitere.cloud.member.domian.entity.UmsMemberLoginLog;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberLoginLogMapper {
    UmsMemberLoginLogDto toDto(UmsMemberLoginLog entity);
    UmsMemberLoginLog toEntity(UmsMemberLoginLogDto dto);
    List<UmsMemberLoginLogDto> toDtoList(List<UmsMemberLoginLog> entities);
}
