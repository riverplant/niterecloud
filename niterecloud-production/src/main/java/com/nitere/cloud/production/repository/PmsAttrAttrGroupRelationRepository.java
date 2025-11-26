package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsAttrAttrGroupRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsAttrAttrGroupRelationRepository extends JpaRepository<PmsAttrAttrGroupRelation, Long> {
}
