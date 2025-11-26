package com.nitere.cloud.order.repository;

import com.nitere.cloud.order.domain.entity.OmsOrderSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OmsOrderSettingRepository
        extends JpaRepository<OmsOrderSetting, Long> {
}
