package com.app.alpha.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true)
    private String email;

    private String password;
    private String nickname;
    private String pin;
    private String fingerprintData;

    @OneToMany(mappedBy = "user")
    private List<Diary> diaries;

    @OneToMany(mappedBy = "user")
    private List<VoiceNote> voiceNotes;

    @OneToMany(mappedBy = "user")
    private List<DiaryPlan> dairyPlans;

}
