package com.app.alpha.repository;

import com.app.alpha.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary,Long> {
    List<Diary> findByUserId(Long userId);
}
