package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsBrandRepository extends JpaRepository<PmsBrand, Long> {
}
