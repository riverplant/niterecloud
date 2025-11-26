package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsAttrGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsAttrGroupRepository extends JpaRepository<PmsAttrGroup, Long> {
}
