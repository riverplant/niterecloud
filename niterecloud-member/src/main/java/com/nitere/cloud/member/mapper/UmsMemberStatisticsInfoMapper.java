package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberStatisticsInfoDto;
import com.nitere.cloud.member.domian.entity.UmsMemberStatisticsInfo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberStatisticsInfoMapper {
    UmsMemberStatisticsInfoDto toDto(UmsMemberStatisticsInfo entity);
    UmsMemberStatisticsInfo toEntity(UmsMemberStatisticsInfoDto dto);
    List<UmsMemberStatisticsInfoDto> toDtoList(List<UmsMemberStatisticsInfo> entities);
}
