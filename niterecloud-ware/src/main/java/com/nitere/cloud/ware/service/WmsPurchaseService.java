package com.nitere.cloud.ware.service;

import com.nitere.cloud.ware.domain.dto.WmsPurchaseDto;
import com.nitere.cloud.ware.domain.entity.WmsPurchase;
import com.nitere.cloud.ware.domain.mapper.WmsPurchaseMapper;
import com.nitere.cloud.ware.repository.WmsPurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WmsPurchaseService {

    private final WmsPurchaseRepository purchaseRepository;
    private final WmsPurchaseMapper purchaseMapper;

    public Page<WmsPurchaseDto> page(int page, int size) {
        int pageIndex = Math.max(page - 1, 0);
        Pageable pageable = PageRequest.of(pageIndex, size, Sort.by(Sort.Direction.DESC, "id"));
        Page<WmsPurchase> purchasePage = purchaseRepository.findAll(pageable);
        return purchasePage.map(purchaseMapper::toDto);
    }

    public WmsPurchaseDto getById(Long id) {
        WmsPurchase entity = purchaseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("採購單不存在, id=" + id));
        return purchaseMapper.toDto(entity);
    }

    public WmsPurchaseDto create(WmsPurchaseDto dto) {
        WmsPurchase entity = purchaseMapper.toEntity(dto);
        entity.setId(null);
        WmsPurchase saved = purchaseRepository.save(entity);
        return purchaseMapper.toDto(saved);
    }

    public WmsPurchaseDto update(Long id, WmsPurchaseDto dto) {
        WmsPurchase entity = purchaseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("採購單不存在, id=" + id));

        entity.setAssigneeId(dto.getAssigneeId());
        entity.setAssigneeName(dto.getAssigneeName());
        entity.setPhone(dto.getPhone());
        entity.setPriority(dto.getPriority());
        entity.setStatus(dto.getStatus());
        entity.setWareId(dto.getWareId());
        entity.setAmount(dto.getAmount());
        entity.setCreateTime(dto.getCreateTime());
        entity.setUpdateTime(dto.getUpdateTime());

        WmsPurchase saved = purchaseRepository.save(entity);
        return purchaseMapper.toDto(saved);
    }

    public void delete(Long id) {
        if (!purchaseRepository.existsById(id)) {
            throw new IllegalArgumentException("採購單不存在, id=" + id);
        }
        purchaseRepository.deleteById(id);
    }
}
