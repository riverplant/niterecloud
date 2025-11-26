package com.nitere.cloud.member.repository;

import com.nitere.cloud.member.domian.entity.UmsMemberStatisticsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsMemberStatisticsInfoRepository
        extends JpaRepository<UmsMemberStatisticsInfo, Long> {
}
