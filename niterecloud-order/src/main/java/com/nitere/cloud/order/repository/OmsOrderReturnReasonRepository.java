package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsOrderReturnReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsOrderReturnReasonRepository
        extends JpaRepository<OmsOrderReturnReason, Long> {
}
