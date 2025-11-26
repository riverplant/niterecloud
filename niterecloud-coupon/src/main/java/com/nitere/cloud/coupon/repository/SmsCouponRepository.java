package com.nitere.cloud.coupon.repository;

import com.nitere.cloud.coupon.domian.entity.SmsCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsCouponRepository extends JpaRepository<SmsCoupon, Long> {
}
