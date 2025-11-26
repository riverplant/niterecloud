// Mapper
package com.nitere.cloud.coupon.domian.mapper;

import com.nitere.cloud.coupon.domian.dto.SmsHomeSubjectDto;
import com.nitere.cloud.coupon.domian.entity.SmsHomeSubject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SmsHomeSubjectMapper {

    SmsHomeSubjectDto toDto(SmsHomeSubject entity);

    SmsHomeSubject toEntity(SmsHomeSubjectDto dto);

    List<SmsHomeSubjectDto> toDtoList(List<SmsHomeSubject> entities);
}
