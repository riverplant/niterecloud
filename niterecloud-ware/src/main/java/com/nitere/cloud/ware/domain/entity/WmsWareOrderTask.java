package com.nitere.cloud.ware.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "wms_ware_order_task")
public class WmsWareOrderTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_sn", length = 255)
    private String orderSn;

    @Column(name = "consignee", length = 100)
    private String consignee;

    @Column(name = "consignee_tel", length = 15)
    private String consigneeTel;

    @Column(name = "delivery_address", length = 500)
    private String deliveryAddress;

    @Column(name = "order_comment", length = 200)
    private String orderComment;

    @Column(name = "payment_way")
    private Integer paymentWay;

    @Column(name = "task_status")
    private Integer taskStatus;

    @Column(name = "order_body", length = 255)
    private String orderBody;

    @Column(name = "tracking_no", length = 30)
    private String trackingNo;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "ware_id")
    private Long wareId;

    @Column(name = "task_comment", length = 500)
    private String taskComment;
}
