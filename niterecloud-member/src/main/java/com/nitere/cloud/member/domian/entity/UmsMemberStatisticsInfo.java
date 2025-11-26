package com.nitere.cloud.member.domian.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ums_member_statistics_info")
public class UmsMemberStatisticsInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "consume_amount", precision = 18, scale = 4)
    private BigDecimal consumeAmount;

    @Column(name = "coupon_amount", precision = 18, scale = 4)
    private BigDecimal couponAmount;

    @Column(name = "order_count")
    private Integer orderCount;

    @Column(name = "coupon_count")
    private Integer couponCount;

    @Column(name = "comment_count")
    private Integer commentCount;

    @Column(name = "return_order_count")
    private Integer returnOrderCount;

    @Column(name = "login_count")
    private Integer loginCount;

    @Column(name = "attend_count")
    private Integer attendCount;

    @Column(name = "fans_count")
    private Integer fansCount;

    @Column(name = "collect_product_count")
    private Integer collectProductCount;

    @Column(name = "collect_subject_count")
    private Integer collectSubjectCount;

    @Column(name = "collect_comment_count")
    private Integer collectCommentCount;

    @Column(name = "invite_friend_count")
    private Integer inviteFriendCount;
}
