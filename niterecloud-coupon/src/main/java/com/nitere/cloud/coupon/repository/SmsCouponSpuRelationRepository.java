// Repository
package com.nitere.cloud.coupon.repository;

import com.nitere.cloud.coupon.domian.entity.SmsCouponSpuRelation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsCouponSpuRelationRepository
        extends JpaRepository<SmsCouponSpuRelation, Long> {
}
