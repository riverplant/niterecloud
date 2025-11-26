package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsSkuSaleAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSkuSaleAttrValueRepository extends JpaRepository<PmsSkuSaleAttrValue, Long> {
}
