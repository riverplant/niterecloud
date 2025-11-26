package com.nitere.cloud.coupon.domian.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SmsCouponDto {

    private Long id;
    private Integer couponType;
    private String couponImg;
    private String couponName;
    private Integer num;
    private BigDecimal amount;
    private Integer perLimit;
    private BigDecimal minPoint;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer useType;
    private String note;
    private Integer publishCount;
    private Integer useCount;
    private Integer receiveCount;
    private LocalDateTime enableStartTime;
    private LocalDateTime enableEndTime;
    private String code;
    private Integer memberLevel;
    private Integer publish;
}
