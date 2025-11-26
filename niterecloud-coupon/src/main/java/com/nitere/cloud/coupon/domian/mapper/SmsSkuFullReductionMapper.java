// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSkuFullReductionDto;
import com.nitere.cloud.coupon.domian.entity.SmsSkuFullReduction;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSkuFullReductionMapper {

    SmsSkuFullReductionDto toDto(SmsSkuFullReduction entity);

    SmsSkuFullReduction toEntity(SmsSkuFullReductionDto dto);

    List<SmsSkuFullReductionDto> toDtoList(List<SmsSkuFullReduction> entities);
}
