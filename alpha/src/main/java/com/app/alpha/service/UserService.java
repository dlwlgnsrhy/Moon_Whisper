//package com.app.alpha.service;
//
//import com.app.alpha.entity.User;
//import com.app.alpha.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    // 유저 생성
//    public User createUser(User user) {
//        if (userRepository.findByEmail(user.getEmail()) != null) {
//            throw new IllegalArgumentException("Email already exists");
//        }
//        return userRepository.save(user);
//    }
//
//    // 유저 조회 (ID로)
//    public User findUserById(Long userId) {
//        return userRepository.findById(userId)
//                .orElseThrow(() -> new IllegalArgumentException("User not found"));
//    }
//
//    // 유저 조회 (Email로)
//    public User findUserByEmail(String email) {
//        return Optional.ofNullable(userRepository.findByEmail(email))
//                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + email));
//    }
//
//    // 유저 정보 수정
//    public User updateUser(Long userId, User updatedUser) {
//        User existingUser = findUserById(userId);
//        existingUser.setNickname(updatedUser.getNickname());
//        existingUser.setPassword(updatedUser.getPassword());
//        existingUser.setPin(updatedUser.getPin());
//        existingUser.setFingerprintData(updatedUser.getFingerprintData());
//        return userRepository.save(existingUser);
//    }
//
//    // 유저 삭제
//    public void deleteUser(Long userId) {
//        if (!userRepository.existsById(userId)) {
//            throw new IllegalArgumentException("User not found");
//        }
//        userRepository.deleteById(userId);
//    }
//}