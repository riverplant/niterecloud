// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsCouponSpuRelationDto;
import com.nitere.cloud.coupon.domian.entity.SmsCouponSpuRelation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsCouponSpuRelationMapper {

    SmsCouponSpuRelationDto toDto(SmsCouponSpuRelation entity);

    SmsCouponSpuRelation toEntity(SmsCouponSpuRelationDto dto);

    List<SmsCouponSpuRelationDto> toDtoList(List<SmsCouponSpuRelation> entities);
}
