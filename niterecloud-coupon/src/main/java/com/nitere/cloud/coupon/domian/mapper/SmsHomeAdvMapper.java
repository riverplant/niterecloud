// Mapper
package com.nitere.cloud.coupon.domian.mapper;


import com.nitere.cloud.coupon.domian.dto.SmsHomeAdvDto;
import com.nitere.cloud.coupon.domian.entity.SmsHomeAdv;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsHomeAdvMapper {

    SmsHomeAdvDto toDto(SmsHomeAdv entity);

    SmsHomeAdv toEntity(SmsHomeAdvDto dto);

    List<SmsHomeAdvDto> toDtoList(List<SmsHomeAdv> entities);
}
