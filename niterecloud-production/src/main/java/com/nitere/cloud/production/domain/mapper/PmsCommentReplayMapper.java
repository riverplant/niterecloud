package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsCommentReplayDto;
import com.nitere.cloud.production.domain.entity.PmsCommentReplay;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsCommentReplayMapper {

    PmsCommentReplayDto toDto(PmsCommentReplay entity);

    PmsCommentReplay toEntity(PmsCommentReplayDto dto);

    List<PmsCommentReplayDto> toDtoList(List<PmsCommentReplay> entities);
}
