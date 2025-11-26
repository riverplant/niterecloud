package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.domain.entity.PmsBrand;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring") // 讓 Spring 自動註冊成 Bean
public interface BrandMapper {

    @Mapping(source = "brandId",   target = "id")
    @Mapping(source = "logo",      target = "logoUrl")
    @Mapping(source = "descript",  target = "description")
    @Mapping(source = "showStatus", target = "status")
    BrandDto toDto(PmsBrand entity);

    @InheritInverseConfiguration
    PmsBrand toEntity(BrandDto dto);

    List<BrandDto> toDtoList(List<PmsBrand> entities);
}
