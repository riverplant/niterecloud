package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberCollectSpuDto;
import com.nitere.cloud.member.domian.entity.UmsMemberCollectSpu;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberCollectSpuMapper {
    UmsMemberCollectSpuDto toDto(UmsMemberCollectSpu entity);
    UmsMemberCollectSpu toEntity(UmsMemberCollectSpuDto dto);
    List<UmsMemberCollectSpuDto> toDtoList(List<UmsMemberCollectSpu> entities);
}
