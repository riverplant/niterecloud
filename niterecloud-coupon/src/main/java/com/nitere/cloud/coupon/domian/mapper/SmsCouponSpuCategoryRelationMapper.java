// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsCouponSpuCategoryRelationDto;
import com.nitere.cloud.coupon.domian.entity.SmsCouponSpuCategoryRelation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsCouponSpuCategoryRelationMapper {

    SmsCouponSpuCategoryRelationDto toDto(SmsCouponSpuCategoryRelation entity);

    SmsCouponSpuCategoryRelation toEntity(SmsCouponSpuCategoryRelationDto dto);

    List<SmsCouponSpuCategoryRelationDto> toDtoList(List<SmsCouponSpuCategoryRelation> entities);
}
