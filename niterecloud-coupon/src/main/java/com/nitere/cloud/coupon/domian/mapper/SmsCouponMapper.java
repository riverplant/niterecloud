package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsCouponDto;
import com.nitere.cloud.coupon.domian.entity.SmsCoupon;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsCouponMapper {

    SmsCouponDto toDto(SmsCoupon entity);

    SmsCoupon toEntity(SmsCouponDto dto);

    List<SmsCouponDto> toDtoList(List<SmsCoupon> entities);
}
