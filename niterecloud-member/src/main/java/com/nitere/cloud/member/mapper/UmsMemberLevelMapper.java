package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberLevelDto;
import com.nitere.cloud.member.domian.entity.UmsMemberLevel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberLevelMapper {
    UmsMemberLevelDto toDto(UmsMemberLevel entity);
    UmsMemberLevel toEntity(UmsMemberLevelDto dto);
    List<UmsMemberLevelDto> toDtoList(List<UmsMemberLevel> entities);
}
