package com.nitere.cloud.member.repository;

import com.nitere.cloud.member.domian.entity.UmsGrowthChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsGrowthChangeHistoryRepository
        extends JpaRepository<UmsGrowthChangeHistory, Long> {
}
