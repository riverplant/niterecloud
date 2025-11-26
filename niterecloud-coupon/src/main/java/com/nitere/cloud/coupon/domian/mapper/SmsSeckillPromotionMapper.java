package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSeckillPromotionDto;
import com.nitere.cloud.coupon.domian.entity.SmsSeckillPromotion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSeckillPromotionMapper {

    SmsSeckillPromotionDto toDto(SmsSeckillPromotion entity);

    SmsSeckillPromotion toEntity(SmsSeckillPromotionDto dto);

    List<SmsSeckillPromotionDto> toDtoList(List<SmsSeckillPromotion> entities);
}
