package com.nitere.cloud.order.service;

import com.nitere.cloud.order.domain.dto.OmsOrderDto;
import com.nitere.cloud.order.domain.entity.OmsOrder;
import com.nitere.cloud.order.domain.mapper.OmsOrderMapper;
import com.nitere.cloud.order.repository.OmsOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OmsOrderService {

    private final OmsOrderRepository orderRepository;
    private final OmsOrderMapper orderMapper;

    public Page<OmsOrderDto> pageOrders(int page, int size) {
        int pageIndex = Math.max(page - 1, 0);
        Pageable pageable = PageRequest.of(pageIndex, size, Sort.by(Sort.Direction.DESC, "id"));
        Page<OmsOrder> orderPage = orderRepository.findAll(pageable);
        return orderPage.map(orderMapper::toDto);
    }

    public OmsOrderDto getById(Long id) {
        OmsOrder order = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("訂單不存在, id=" + id));
        return orderMapper.toDto(order);
    }

    public OmsOrderDto create(OmsOrderDto dto) {
        OmsOrder entity = orderMapper.toEntity(dto);
        entity.setId(null);        // 交給 DB 自增
        OmsOrder saved = orderRepository.save(entity);
        return orderMapper.toDto(saved);
    }

    public OmsOrderDto update(Long id, OmsOrderDto dto) {
        OmsOrder entity = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("訂單不存在, id=" + id));

        // 這裡簡單全量覆蓋，你可以按需只更新部分字段
        entity.setMemberId(dto.getMemberId());
        entity.setOrderSn(dto.getOrderSn());
        entity.setCouponId(dto.getCouponId());
        entity.setCreateTime(dto.getCreateTime());
        entity.setMemberUsername(dto.getMemberUsername());
        entity.setTotalAmount(dto.getTotalAmount());
        entity.setPayAmount(dto.getPayAmount());
        entity.setFreightAmount(dto.getFreightAmount());
        entity.setPromotionAmount(dto.getPromotionAmount());
        entity.setIntegrationAmount(dto.getIntegrationAmount());
        entity.setCouponAmount(dto.getCouponAmount());
        entity.setDiscountAmount(dto.getDiscountAmount());
        entity.setPayType(dto.getPayType());
        entity.setSourceType(dto.getSourceType());
        entity.setStatus(dto.getStatus());
        entity.setDeliveryCompany(dto.getDeliveryCompany());
        entity.setDeliverySn(dto.getDeliverySn());
        entity.setAutoConfirmDay(dto.getAutoConfirmDay());
        entity.setIntegration(dto.getIntegration());
        entity.setGrowth(dto.getGrowth());
        entity.setBillType(dto.getBillType());
        entity.setBillHeader(dto.getBillHeader());
        entity.setBillContent(dto.getBillContent());
        entity.setBillReceiverPhone(dto.getBillReceiverPhone());
        entity.setBillReceiverEmail(dto.getBillReceiverEmail());
        entity.setReceiverName(dto.getReceiverName());
        entity.setReceiverPhone(dto.getReceiverPhone());
        entity.setReceiverPostCode(dto.getReceiverPostCode());
        entity.setReceiverProvince(dto.getReceiverProvince());
        entity.setReceiverCity(dto.getReceiverCity());
        entity.setReceiverRegion(dto.getReceiverRegion());
        entity.setReceiverDetailAddress(dto.getReceiverDetailAddress());
        entity.setNote(dto.getNote());
        entity.setConfirmStatus(dto.getConfirmStatus());
        entity.setDeleteStatus(dto.getDeleteStatus());
        entity.setUseIntegration(dto.getUseIntegration());
        entity.setPaymentTime(dto.getPaymentTime());
        entity.setDeliveryTime(dto.getDeliveryTime());
        entity.setReceiveTime(dto.getReceiveTime());
        entity.setCommentTime(dto.getCommentTime());
        entity.setModifyTime(dto.getModifyTime());

        OmsOrder saved = orderRepository.save(entity);
        return orderMapper.toDto(saved);
    }

    public void delete(Long id) {
        if (!orderRepository.existsById(id)) {
            throw new IllegalArgumentException("訂單不存在, id=" + id);
        }
        orderRepository.deleteById(id);
    }
}
