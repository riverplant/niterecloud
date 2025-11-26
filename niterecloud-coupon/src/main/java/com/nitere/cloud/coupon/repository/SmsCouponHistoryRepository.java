// Repository
package com.nitere.cloud.coupon.repository;

import com.nitere.cloud.coupon.domian.entity.SmsCouponHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsCouponHistoryRepository extends JpaRepository<SmsCouponHistory, Long> {
}
