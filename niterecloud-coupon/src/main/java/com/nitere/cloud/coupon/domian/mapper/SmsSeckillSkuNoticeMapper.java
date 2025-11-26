// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSeckillSkuNoticeDto;
import com.nitere.cloud.coupon.domian.entity.SmsSeckillSkuNotice;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSeckillSkuNoticeMapper {

    SmsSeckillSkuNoticeDto toDto(SmsSeckillSkuNotice entity);

    SmsSeckillSkuNotice toEntity(SmsSeckillSkuNoticeDto dto);

    List<SmsSeckillSkuNoticeDto> toDtoList(List<SmsSeckillSkuNotice> entities);
}
