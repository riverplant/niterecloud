package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsOrderItemRepository extends JpaRepository<OmsOrderItem, Long> {
}
