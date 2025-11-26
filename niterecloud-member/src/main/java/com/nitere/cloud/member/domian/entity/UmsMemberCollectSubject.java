package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ums_member_collect_subject")
public class UmsMemberCollectSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "subject_name", length = 255)
    private String subjectName;

    @Column(name = "subject_img", length = 500)
    private String subjectImg;

    // 表裡叫 subject_urll，這裡用正常命名
    @Column(name = "subject_urll", length = 500)
    private String subjectUrl;
}
