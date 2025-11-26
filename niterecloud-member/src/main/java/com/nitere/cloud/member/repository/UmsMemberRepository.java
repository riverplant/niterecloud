package com.nitere.cloud.member.repository;

import com.nitere.cloud.member.domian.entity.UmsMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UmsMemberRepository extends JpaRepository<UmsMember, Long> {
}
