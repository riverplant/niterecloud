// DTO
package com.nitere.cloud.coupon.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeSubjectSpuDto {

    private Long id;
    private String name;
    private Long subjectId;
    private Long spuId;
    private Integer sort;
}
