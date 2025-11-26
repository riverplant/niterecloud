package com.nitere.cloud.member.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberCollectSubjectDto {

    private Long id;
    private Long subjectId;
    private String subjectName;
    private String subjectImg;
    private String subjectUrl;
}
