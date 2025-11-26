package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsPaymentInfoRepository
        extends JpaRepository<OmsPaymentInfo, Long> {
}
