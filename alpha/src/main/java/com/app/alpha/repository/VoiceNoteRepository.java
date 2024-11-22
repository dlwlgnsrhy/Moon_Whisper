package com.app.alpha.repository;

import com.app.alpha.entity.VoiceNote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoiceNoteRepository extends JpaRepository<VoiceNote, Long> {
    List<VoiceNote> findByUser_UserId(Long userId);  // 특정 사용자의 음성 노트 조회
}