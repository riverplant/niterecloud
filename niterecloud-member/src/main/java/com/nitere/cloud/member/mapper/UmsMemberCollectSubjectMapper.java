package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberCollectSubjectDto;
import com.nitere.cloud.member.domian.entity.UmsMemberCollectSubject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberCollectSubjectMapper {
    UmsMemberCollectSubjectDto toDto(UmsMemberCollectSubject entity);
    UmsMemberCollectSubject toEntity(UmsMemberCollectSubjectDto dto);
    List<UmsMemberCollectSubjectDto> toDtoList(List<UmsMemberCollectSubject> entities);
}
