package com.nitere.cloud.member.mapper;

import com.nitere.cloud.member.domian.dto.UmsMemberReceiveAddressDto;
import com.nitere.cloud.member.domian.entity.UmsMemberReceiveAddress;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UmsMemberReceiveAddressMapper {
    UmsMemberReceiveAddressDto toDto(UmsMemberReceiveAddress entity);
    UmsMemberReceiveAddress toEntity(UmsMemberReceiveAddressDto dto);
    List<UmsMemberReceiveAddressDto> toDtoList(List<UmsMemberReceiveAddress> entities);
}
