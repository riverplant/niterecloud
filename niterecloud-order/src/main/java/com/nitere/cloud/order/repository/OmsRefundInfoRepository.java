package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsRefundInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsRefundInfoRepository
        extends JpaRepository<OmsRefundInfo, Long> {
}
