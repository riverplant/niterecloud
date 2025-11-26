// DTO
package com.nitere.cloud.coupon.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsHomeAdvDto {

    private Long id;
    private String name;
    private String pic;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer status;
    private Integer clickCount;
    private String url;
    private String note;
    private Integer sort;
    private Long publisherId;
    private Long authId;
}
