//package com.app.alpha.config;
//
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public GroupedOpenApi userApi() {
//        return GroupedOpenApi.builder()
//                .group("user-api")
//                .packagesToScan("com.app.alpha.controller")
//                .pathsToMatch("/**")
//                .build();
//    }
//}