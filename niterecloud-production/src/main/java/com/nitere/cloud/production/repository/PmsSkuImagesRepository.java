package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsSkuImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSkuImagesRepository extends JpaRepository<PmsSkuImages, Long> {
}
