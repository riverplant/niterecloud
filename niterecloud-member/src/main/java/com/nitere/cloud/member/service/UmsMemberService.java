package com.nitere.cloud.member.service;

import com.nitere.cloud.member.domian.dto.UmsMemberDto;
import com.nitere.cloud.member.domian.entity.UmsMember;
import com.nitere.cloud.member.mapper.UmsMemberMapper;
import com.nitere.cloud.member.repository.UmsMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UmsMemberService {

    private final UmsMemberRepository memberRepository;
    private final UmsMemberMapper memberMapper;

    public Page<UmsMemberDto> pageMembers(int page, int size) {
        int pageIndex = Math.max(page - 1, 0);
        Pageable pageable = PageRequest.of(pageIndex, size, Sort.by(Sort.Direction.DESC, "id"));
        Page<UmsMember> memberPage = memberRepository.findAll(pageable);
        return memberPage.map(memberMapper::toDto);
    }

    public UmsMemberDto getById(Long id) {
        UmsMember member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("會員不存在, id=" + id));
        return memberMapper.toDto(member);
    }

    public UmsMemberDto create(UmsMemberDto dto) {
        UmsMember entity = memberMapper.toEntity(dto);
        entity.setId(null); // 確保讓 DB 生成主鍵
        UmsMember saved = memberRepository.save(entity);
        return memberMapper.toDto(saved);
    }

    public UmsMemberDto update(Long id, UmsMemberDto dto) {
        UmsMember entity = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("會員不存在, id=" + id));

        entity.setLevelId(dto.getLevelId());
        entity.setUsername(dto.getUsername());
        entity.setPassword(dto.getPassword());
        entity.setNickname(dto.getNickname());
        entity.setMobile(dto.getMobile());
        entity.setEmail(dto.getEmail());
        entity.setHeader(dto.getHeader());
        entity.setGender(dto.getGender());
        entity.setBirth(dto.getBirth());
        entity.setCity(dto.getCity());
        entity.setJob(dto.getJob());
        entity.setSign(dto.getSign());
        entity.setSourceType(dto.getSourceType());
        entity.setIntegration(dto.getIntegration());
        entity.setGrowth(dto.getGrowth());
        entity.setStatus(dto.getStatus());
        entity.setCreateTime(dto.getCreateTime());

        UmsMember saved = memberRepository.save(entity);
        return memberMapper.toDto(saved);
    }

    public void delete(Long id) {
        if (!memberRepository.existsById(id)) {
            throw new IllegalArgumentException("會員不存在, id=" + id);
        }
        memberRepository.deleteById(id);
    }
}
