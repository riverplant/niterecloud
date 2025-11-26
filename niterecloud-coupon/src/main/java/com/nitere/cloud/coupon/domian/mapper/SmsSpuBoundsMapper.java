// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSpuBoundsDto;
import com.nitere.cloud.coupon.domian.entity.SmsSpuBounds;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSpuBoundsMapper {

    SmsSpuBoundsDto toDto(SmsSpuBounds entity);

    SmsSpuBounds toEntity(SmsSpuBoundsDto dto);

    List<SmsSpuBoundsDto> toDtoList(List<SmsSpuBounds> entities);
}
