//package com.app.alpha.service;
//
//import com.app.alpha.entity.Diary;
//import com.app.alpha.entity.User;
//import com.app.alpha.repository.DiaryRepository;
//import com.app.alpha.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class DiaryService {
//
//    @Autowired
//    private DiaryRepository diaryRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public Diary saveDiary(Long userId, String content, String emotionTags, String createdAt, String cloudUrl, String moodImage){
//        User user = userRepository.findById(userId).orElseThrow(()-> new IllegalArgumentException("User not found"));
//
//        Diary diary = new Diary();
//        diary.setUser(user);
//        diary.setContent(content);
//        diary.setEmotionTags(emotionTags);
//        diary.setCreatedAt(LocalDateTime.now());
//        diary.setCloudUrl(cloudUrl);
//        diary.setMoodImage(moodImage);
//
//        return diaryRepository.save(diary);
//
//    }
//
//    public List<Diary> getDiariesByUserId(Long userId){
//        return diaryRepository.findByUserUserId(userId);
//    }
//}
