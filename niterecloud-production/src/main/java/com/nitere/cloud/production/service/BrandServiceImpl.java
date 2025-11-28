package com.nitere.cloud.production.service;

import com.nitere.cloud.commons.domain.enums.exception.BrandNotFoundException;
import com.nitere.cloud.production.domain.dto.BrandDto;
import com.nitere.cloud.production.domain.entity.PmsBrand;
import com.nitere.cloud.production.domain.mapper.BrandMapper;
import com.nitere.cloud.production.repository.PmsBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final PmsBrandRepository brandRepository;
    private final BrandMapper brandMapper;

    @Override
    public Page<BrandDto> pageBrands(int page, int size) {
        int pageIndex = Math.max(page - 1, 0);

        Pageable pageable = PageRequest.of(
                pageIndex,
                size,
                Sort.by(Sort.Direction.DESC, "brandId")  // 按品牌ID倒序
        );

        Page<PmsBrand> brandPage = brandRepository.findAll(pageable);

        // 用 Page.map 把 entity 映射成 DTO
        return brandPage.map(brandMapper::toDto);
    }

    @Override
    public BrandDto create(BrandDto dto) {
        PmsBrand entity = brandMapper.toEntity(dto);
        // 確保是新增，不要用到前端傳來的 id
        entity.setBrandId(null);

        PmsBrand saved = brandRepository.save(entity);
        return brandMapper.toDto(saved);
    }

    @Override
    public BrandDto update(Long id, BrandDto dto) {
        PmsBrand entity = brandRepository.findById(id)
                .orElseThrow(() -> new BrandNotFoundException(id));

        // 這裡我們手動把 DTO 的值塞回 entity（避免改到主鍵）
        entity.setName(dto.getName());
        entity.setLogo(dto.getLogoUrl());
        entity.setDescript(dto.getDescription());
        entity.setShowStatus(dto.getStatus());
        entity.setFirstLetter(dto.getFirstLetter());
        entity.setSort(dto.getSort());

        PmsBrand saved = brandRepository.save(entity);
        return brandMapper.toDto(saved);
    }

    @Override
    public BrandDto getById(Long id) {
        PmsBrand brand = brandRepository.findById(id)
                .orElseThrow(() -> new BrandNotFoundException(id));
        return brandMapper.toDto(brand);
    }

    @Override
    public void delete(Long id) {
        if (!brandRepository.existsById(id)) {
            throw new BrandNotFoundException(id);
        }
        brandRepository.deleteById(id);
    }
}
