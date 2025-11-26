package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.PmsSpuCommentDto;
import com.nitere.cloud.production.domain.entity.PmsSpuComment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PmsSpuCommentMapper {

    PmsSpuCommentDto toDto(PmsSpuComment entity);

    PmsSpuComment toEntity(PmsSpuCommentDto dto);

    List<PmsSpuCommentDto> toDtoList(List<PmsSpuComment> entities);
}
