package com.app.alpha.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diary_id") // 데이터베이스의 diary_id에 매핑
    private Long diaryId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false) // 정확한 참조 칼럼 명시
    private User user;

    @Column(name = "content")
    private String content;

    @Column(name = "emotion_tags") // 테이블 칼럼에 맞게 매핑
    private String emotionTags;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "cloud_url")
    private String cloudUrl;

    @Column(name = "mood_image")
    private String moodImage;
}