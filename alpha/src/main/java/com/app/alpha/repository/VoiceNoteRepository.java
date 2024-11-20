package com.app.alpha.repository;

import com.app.alpha.entity.VoiceNote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoiceNoteRepository extends JpaRepository<VoiceNote, Long> {
    List<VoiceNote> findByUserId(Long userId);
}
