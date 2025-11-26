package com.nitere.cloud.production.domain.dto;

import lombok.Data;

@Data
public class PmsCommentReplayDto {

    private Long id;
    private Long commentId;
    private Long replyId;
}
