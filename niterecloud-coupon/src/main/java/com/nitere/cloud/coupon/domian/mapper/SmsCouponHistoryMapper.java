// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsCouponHistoryDto;
import com.nitere.cloud.coupon.domian.entity.SmsCouponHistory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsCouponHistoryMapper {

    SmsCouponHistoryDto toDto(SmsCouponHistory entity);

    SmsCouponHistory toEntity(SmsCouponHistoryDto dto);

    List<SmsCouponHistoryDto> toDtoList(List<SmsCouponHistory> entities);
}
