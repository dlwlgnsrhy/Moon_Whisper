//package com.app.alpha.repository;
//
//import com.app.alpha.entity.Diary;
//import com.app.alpha.entity.User;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@Transactional
//public class DiaryRepositoryTest {
//
//    @Autowired
//    private DiaryRepository diaryRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testFindByUserUserId() {
//        // 사용자 생성
//        User user = new User();
//        user.setEmail("test@example.com");
//        user.setPassword("password");
//        userRepository.save(user);
//
//        // 다이어리 생성
//        Diary diary = new Diary();
//        diary.setUser(user);
//        diary.setContent("Test Content");
//        diaryRepository.save(diary);
//
//        // 다이어리 조회
//        List<Diary> diaries = diaryRepository.findByUserId(user.getUserId());
//        assertThat(diaries).isNotEmpty();
//        assertThat(diaries.get(0).getContent()).isEqualTo("Test Content");
//    }
//}