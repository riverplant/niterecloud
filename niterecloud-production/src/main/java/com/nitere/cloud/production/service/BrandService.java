package com.nitere.cloud.production.service;

import com.nitere.cloud.production.domain.dto.BrandDto;
import org.springframework.data.domain.Page;

public interface BrandService {

    Page<BrandDto> pageBrands(int page, int size);

    BrandDto create(BrandDto dto);

    BrandDto update(Long id, BrandDto dto);

    BrandDto getById(Long id);

    void delete(Long id);
}
