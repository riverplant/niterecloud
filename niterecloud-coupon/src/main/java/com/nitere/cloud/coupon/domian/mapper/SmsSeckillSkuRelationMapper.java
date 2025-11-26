// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSeckillSkuRelationDto;
import com.nitere.cloud.coupon.domian.entity.SmsSeckillSkuRelation;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSeckillSkuRelationMapper {

    SmsSeckillSkuRelationDto toDto(SmsSeckillSkuRelation entity);

    SmsSeckillSkuRelation toEntity(SmsSeckillSkuRelationDto dto);

    List<SmsSeckillSkuRelationDto> toDtoList(List<SmsSeckillSkuRelation> entities);
}
