package com.nitere.cloud.production.repository;

import com.nitere.cloud.production.domain.entity.PmsCommentReplay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsCommentReplayRepository extends JpaRepository<PmsCommentReplay, Long> {
}
