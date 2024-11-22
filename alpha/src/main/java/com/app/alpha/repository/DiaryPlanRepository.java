package com.app.alpha.repository;

import com.app.alpha.entity.DiaryPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryPlanRepository extends JpaRepository<DiaryPlan, Long> {
    List<DiaryPlan> findByUser_UserId(Long userId);  // 특정 사용자의 일기 계획 조회
}