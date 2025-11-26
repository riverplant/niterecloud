package com.nitere.cloud.order.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "oms_order_operate_history")
public class OmsOrderOperateHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "operate_man", length = 100)
    private String operateMan;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "order_status")
    private Integer orderStatus;

    @Column(name = "note", length = 500)
    private String note;
}
