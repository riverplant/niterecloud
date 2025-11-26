package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsCategoryRepository extends JpaRepository<PmsCategory, Long> {
}
