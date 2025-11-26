package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsSkuInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSkuInfoRepository extends JpaRepository<PmsSkuInfo, Long> {
}
