package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setName("Lee Taesung");
        user.setEmail("leetsxpro@gmail.com");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

//        User user1 = new User(null, "Lee Taesung", "leetsxpro@gmail.com", LocalDateTime.now(), LocalDateTime.now(), null);
        User user2 = new User("Lee Taesung", "leetsxpro@gmail.com");

        User user3 = User.builder()
                .name("Lee Taesung")
                .email("leetsxpro@gmail.com")
                .build();

        System.out.println(">>> " + user3.toString());
    }
}