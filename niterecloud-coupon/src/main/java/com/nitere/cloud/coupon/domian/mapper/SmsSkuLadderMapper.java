// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSkuLadderDto;
import com.nitere.cloud.coupon.domian.entity.SmsSkuLadder;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSkuLadderMapper {

    SmsSkuLadderDto toDto(SmsSkuLadder entity);

    SmsSkuLadder toEntity(SmsSkuLadderDto dto);

    List<SmsSkuLadderDto> toDtoList(List<SmsSkuLadder> entities);
}
