//package com.app.alpha.controller;
//
//import com.app.alpha.entity.VoiceNote;
//import com.app.alpha.service.VoiceNoteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/voice-notes")
//public class VoiceNoteController {
//
//    @Autowired
//    private VoiceNoteService voiceNoteService;
//
//    @PostMapping("/save")
//    public VoiceNote saveVoiceNote(@RequestParam Long userId,
//                                   @RequestParam String fileUrl,
//                                   @RequestParam LocalDateTime createdAt){
//        return voiceNoteService.saveVoiceNote(userId,fileUrl,createdAt);
//    }
//    @GetMapping("/user/{userId}")
//    public List<VoiceNote> getVoiceNoteByUserId(@PathVariable Long userId){
//        return voiceNoteService.getVoiceNoteByUserId(userId);
//    }
//}
