package com.nitere.cloud.member.repository;

import com.nitere.cloud.member.domian.entity.UmsIntegrationChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsIntegrationChangeHistoryRepository
        extends JpaRepository<UmsIntegrationChangeHistory, Long> {
}
