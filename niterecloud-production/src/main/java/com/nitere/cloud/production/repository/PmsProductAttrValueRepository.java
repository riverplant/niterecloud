package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsProductAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsProductAttrValueRepository extends JpaRepository<PmsProductAttrValue, Long> {
}
