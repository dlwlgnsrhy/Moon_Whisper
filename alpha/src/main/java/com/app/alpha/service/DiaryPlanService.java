//package com.app.alpha.service;
//
//import com.app.alpha.entity.DiaryPlan;
//import com.app.alpha.entity.User;
//import com.app.alpha.repository.DiaryPlanRepository;
//import com.app.alpha.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class DiaryPlanService {
//    @Autowired
//    private DiaryPlanRepository diaryPlanRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public DiaryPlan saveDiaryPlan(Long userId, String goal, String status, LocalDateTime reminderTime) {
//        User user = userRepository.findById(userId).orElseThrow(()->new IllegalArgumentException("User not found"));
//
//        DiaryPlan diaryPlan =new DiaryPlan();
//        diaryPlan.setUser(user);
//        diaryPlan.setGoal(goal);
//        diaryPlan.setStatus(status);
//        diaryPlan.setReminderTime(reminderTime);
//
//        return diaryPlanRepository.save(diaryPlan);
//    }
//
//    public List<DiaryPlan> getDiaryPlanByUserId(Long userId) {
//        return diaryPlanRepository.findByUserId(userId);
//    }
//}
