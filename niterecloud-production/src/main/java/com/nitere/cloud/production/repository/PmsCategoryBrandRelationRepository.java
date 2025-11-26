package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsCategoryBrandRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsCategoryBrandRelationRepository extends JpaRepository<PmsCategoryBrandRelation, Long> {
}
