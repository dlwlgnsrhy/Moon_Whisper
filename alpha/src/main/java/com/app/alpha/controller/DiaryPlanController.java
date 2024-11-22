//package com.app.alpha.controller;
//
//import com.app.alpha.entity.DiaryPlan;
//import com.app.alpha.service.DiaryPlanService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/diary-plans")
//public class DiaryPlanController {
//
//    @Autowired
//    private DiaryPlanService diaryPlanService;
//
//    @PostMapping("/save")
//    public DiaryPlan saveDiaryPlan(@RequestParam Long userId,
//                                   @RequestParam String goal,
//                                   @RequestParam String status,
//                                   @RequestParam LocalDateTime reminderTime){
//        return  diaryPlanService.saveDiaryPlan(userId,goal,status,reminderTime);
//    }
//
//    @GetMapping("/user/{userId}")
//    public List<DiaryPlan> getDiaryPlansByUserId(@PathVariable Long userId){
//        return diaryPlanService.getDiaryPlanByUserId(userId);
//    }
//}
