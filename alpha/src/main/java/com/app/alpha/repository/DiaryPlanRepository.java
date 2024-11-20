package com.app.alpha.repository;

import com.app.alpha.entity.DiaryPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryPlanRepository extends JpaRepository<DiaryPlan, Long> {
    List<DiaryPlan> findByUserId(Long userId);
}
