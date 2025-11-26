// Repository
package com.nitere.cloud.coupon.repository;

import com.nitere.cloud.coupon.domian.entity.SmsCouponSpuCategoryRelation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmsCouponSpuCategoryRelationRepository
        extends JpaRepository<SmsCouponSpuCategoryRelation, Long> {
}
