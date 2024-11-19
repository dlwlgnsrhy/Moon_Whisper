//package com.app.alpha.config;
//
//import com.app.alpha.service.SecurityUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfiguration {
//
//    @Autowired
//    private SecurityUserService service;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeRequests((authorizeRequests) ->
//                        authorizeRequests
//                                .requestMatchers("/login", "/signup", "/user").permitAll()  // 로그인, 회원가입, 사용자 페이지는 누구나 접근 가능
//                                .anyRequest().authenticated()  // 나머지 요청은 인증된 사용자만 접근 가능
//                )
//                .formLogin((formLogin) ->
//                        formLogin
//                                .loginPage("/login")  // 로그인 페이지 URL
//                                .defaultSuccessUrl("/articles")  // 로그인 성공 후 리디렉션될 URL
//                )
//                .logout((logoutConfig) ->
//                        logoutConfig
//                                .logoutSuccessUrl("/login")  // 로그아웃 후 리디렉션될 URL
//                                .invalidateHttpSession(true)  // 세션 무효화
//                )
//                .csrf((csrfConfig) ->
//                        csrfConfig.disable()  // CSRF 보호 비활성화
//                )
//                .build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();  // BCryptPasswordEncoder를 사용하여 패스워드 암호화
//    }
//}