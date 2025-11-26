package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsOrderOperateHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsOrderOperateHistoryRepository
        extends JpaRepository<OmsOrderOperateHistory, Long> {
}
