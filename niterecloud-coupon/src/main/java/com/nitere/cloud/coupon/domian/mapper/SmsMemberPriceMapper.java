// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsMemberPriceDto;
import com.nitere.cloud.coupon.domian.entity.SmsMemberPrice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsMemberPriceMapper {

    SmsMemberPriceDto toDto(SmsMemberPrice entity);

    SmsMemberPrice toEntity(SmsMemberPriceDto dto);

    List<SmsMemberPriceDto> toDtoList(List<SmsMemberPrice> entities);
}
