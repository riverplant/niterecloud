package com.nitere.cloud.production.domain.mapper;

import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.domain.entity.PmsBrand;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring") // 讓 Spring 自動註冊成 Bean
public interface BrandMapper {
    String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    @Mapping(source = "brandId", target = "id")
    @Mapping(source = "logo", target = "logoUrl")
    @Mapping(source = "descript", target = "description")
    @Mapping(source = "showStatus", target = "status")
    @Mapping(source = "createTime", target = "createTime", qualifiedByName = "dateToString")
    @Mapping(source = "updateTime", target = "updateTime", qualifiedByName = "dateToString")
    BrandDto toDto(PmsBrand entity);

    @InheritInverseConfiguration
    @Mapping(source = "createTime", target = "createTime", qualifiedByName = "stringToDate")
    @Mapping(source = "updateTime", target = "updateTime", qualifiedByName = "stringToDate")
    PmsBrand toEntity(BrandDto dto);

    List<BrandDto> toDtoList(List<PmsBrand> entities);

    @Named("dateToString")
    default String dateToString(Date date) {
        if (date == null) return null;
        return new SimpleDateFormat(DATE_PATTERN).format(date);
    }

    @Named("stringToDate")
    default Date stringToDate(String text) {
        if (text == null || text.isEmpty()) return null;
        try {
            return new SimpleDateFormat(DATE_PATTERN).parse(text);
        } catch (ParseException e) {
            throw new RuntimeException("Invalid date format: " + text, e);
        }
    }
}
