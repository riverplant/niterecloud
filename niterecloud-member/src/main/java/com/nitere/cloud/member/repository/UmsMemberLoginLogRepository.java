package com.nitere.cloud.member.repository;

import com.nitere.cloud.member.domian.entity.UmsMemberLoginLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsMemberLoginLogRepository
        extends JpaRepository<UmsMemberLoginLog, Long> {
}
