package com.app.alpha.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class DiaryPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    @ManyToOne
    @JsonIgnore //순환 참조 방지 user<-> DiaryPlan
    @JoinColumn(name = "user_id")
    private User user;

    private String goal; //일기 작성 목표
    private String status; //목표 진행 상태
    private LocalDateTime reminderTime; //알림 시간
}
