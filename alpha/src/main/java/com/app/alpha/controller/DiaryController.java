//package com.app.alpha.controller;
//
//import com.app.alpha.entity.Diary;
//import com.app.alpha.service.DiaryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/diaries")
//public class DiaryController {
//
//    @Autowired
//    private DiaryService diaryService;
//
//    @PostMapping("/save")
//    public Diary saveDiary(@RequestParam Long userId,
//                           @RequestParam String content,
//                           @RequestParam String emotionTags,
//                           @RequestParam String createdAt,
//                           @RequestParam String cloudUrl,
//                           @RequestParam String moodImage) {
//        return diaryService.saveDiary(userId, content, emotionTags, createdAt, cloudUrl, moodImage);
//    }
//
//    @GetMapping("/user/{userId}")
//    public List<Diary> getUserDiaries(@PathVariable Long userId) {
//        return diaryService.getDiariesByUserId(userId);
//    }
//}
