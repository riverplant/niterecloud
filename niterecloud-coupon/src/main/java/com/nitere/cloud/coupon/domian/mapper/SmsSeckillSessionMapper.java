// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsSeckillSessionDto;
import com.nitere.cloud.coupon.domian.entity.SmsSeckillSession;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsSeckillSessionMapper {

    SmsSeckillSessionDto toDto(SmsSeckillSession entity);

    SmsSeckillSession toEntity(SmsSeckillSessionDto dto);

    List<SmsSeckillSessionDto> toDtoList(List<SmsSeckillSession> entities);
}
