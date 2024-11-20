package com.app.alpha.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diaryId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;
    private String emotionTags; //JSON 형태로 저장(ex: "happy","excited")
    private LocalDateTime createdAt;
    private String cloudUrl; // 클라우드 저장 음성 파일 URL
    private String moodImage; //AI가 추천한 이미지 URL


}
