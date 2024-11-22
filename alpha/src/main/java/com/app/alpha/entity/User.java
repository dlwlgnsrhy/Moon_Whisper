package com.app.alpha.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") // DB의 user_id와 매핑
    private Long userId;

    @Column(unique = true)
    private String email;
    private String fingerprintData;
    private String nickname;
    private String password;
    private String pin;
}