package com.nitere.cloud.ware.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "wms_ware_order_task_detail")
public class WmsWareOrderTaskDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sku_id")
    private Long skuId;

    @Column(name = "sku_name", length = 255)
    private String skuName;

    @Column(name = "sku_num")
    private Integer skuNum;

    @Column(name = "task_id")
    private Long taskId;
}
