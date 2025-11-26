package com.nitere.cloud.coupon.repository;

import com.nitere.cloud.coupon.domian.entity.SmsSeckillPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSeckillPromotionRepository extends JpaRepository<SmsSeckillPromotion, Long> {
}
