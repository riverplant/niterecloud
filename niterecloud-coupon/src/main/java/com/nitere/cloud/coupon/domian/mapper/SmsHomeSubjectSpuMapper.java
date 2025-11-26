// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsHomeSubjectSpuDto;
import com.nitere.cloud.coupon.domian.entity.SmsHomeSubjectSpu;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsHomeSubjectSpuMapper {

    SmsHomeSubjectSpuDto toDto(SmsHomeSubjectSpu entity);

    SmsHomeSubjectSpu toEntity(SmsHomeSubjectSpuDto dto);

    List<SmsHomeSubjectSpuDto> toDtoList(List<SmsHomeSubjectSpu> entities);
}
