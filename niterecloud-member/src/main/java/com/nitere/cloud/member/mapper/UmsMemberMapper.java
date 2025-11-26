package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberDto;
import com.nitere.cloud.member.domian.entity.UmsMember;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberMapper {
    UmsMemberDto toDto(UmsMember entity);
    UmsMember toEntity(UmsMemberDto dto);
    List<UmsMemberDto> toDtoList(List<UmsMember> entities);
}
