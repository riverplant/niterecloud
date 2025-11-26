// DTO
package com.nitere.cloud.coupon.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeSubjectDto {

    private Long id;
    private String name;
    private String title;
    private String subTitle;
    private Integer status;
    private String url;
    private Integer sort;
    private String img;
}
