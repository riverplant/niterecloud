package com.nitere.cloud.production.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pms_comment_replay")
public class PmsCommentReplay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "reply_id")
    private Long replyId;

    // getters / setters
}
