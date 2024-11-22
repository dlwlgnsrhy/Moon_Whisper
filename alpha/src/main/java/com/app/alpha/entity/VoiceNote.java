package com.app.alpha.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class VoiceNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voiceNoteId;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user_id")
    private User user;

    private String fileUrl; //클라우드 저장 음성 파일 URL
    private LocalDateTime createdAt;


}
