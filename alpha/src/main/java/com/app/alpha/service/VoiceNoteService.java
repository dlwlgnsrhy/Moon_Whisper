//package com.app.alpha.service;
//
//import com.app.alpha.entity.User;
//import com.app.alpha.entity.VoiceNote;
//import com.app.alpha.repository.UserRepository;
//import com.app.alpha.repository.VoiceNoteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class VoiceNoteService {
//
//    @Autowired
//    private VoiceNoteRepository voiceNoteRepository;
//    @Autowired
//    private UserRepository userRepository;
//
//    public VoiceNote saveVoiceNote(Long userId, String fileUrl, LocalDateTime createdAt) {
//        User user = userRepository.findById(userId).orElseThrow(()->new IllegalArgumentException("User not found"));
//
//        VoiceNote voiceNote = new VoiceNote();
//        voiceNote.setUser(user);
//        voiceNote.setFileUrl(fileUrl);
//        voiceNote.setCreatedAt(createdAt);
//
//        return voiceNoteRepository.save(voiceNote);
//
//    }
//
//    public List<VoiceNote> getVoiceNoteByUserId(Long userId) {
//        return voiceNoteRepository.findByUserId(userId);
//    }
//}
