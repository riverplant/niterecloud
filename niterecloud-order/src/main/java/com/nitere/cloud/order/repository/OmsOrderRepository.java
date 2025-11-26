package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsOrderRepository extends JpaRepository<OmsOrder, Long> {
}
