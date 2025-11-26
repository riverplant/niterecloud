package com.nitere.cloud.member.domian.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UmsMemberStatisticsInfoDto {

    private Long id;
    private Long memberId;
    private BigDecimal consumeAmount;
    private BigDecimal couponAmount;
    private Integer orderCount;
    private Integer couponCount;
    private Integer commentCount;
    private Integer returnOrderCount;
    private Integer loginCount;
    private Integer attendCount;
    private Integer fansCount;
    private Integer collectProductCount;
    private Integer collectSubjectCount;
    private Integer collectCommentCount;
    private Integer inviteFriendCount;
}
