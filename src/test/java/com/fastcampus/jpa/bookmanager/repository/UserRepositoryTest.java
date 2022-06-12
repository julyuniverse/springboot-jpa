package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {

//        // findAll
//        // 첫 번째 방법
//        userRepository.findAll().forEach(System.out::println);
//
//        // 두 번째 방법
//        for (User user : userRepository.findAll()) {
//            System.out.println(user);
//        }
//        // order by
//        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name")); // name 역순으로 정렬

//        // findAllById
//        List<User> users = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
//
//        users.forEach(System.out::println);

//        // saveAll
//        User user1 = new User("jack", "jack@gmail.com");
//        User user2 = new User("steve", "steve@gmail.com");
//
//        userRepository.saveAll(Lists.newArrayList(user1, user2));
//
//        List<User> users = userRepository.findAll();
//
//        users.forEach(System.out::println);

//        // save
//        User user1 = new User("jack", "jack@gmail.com");
//
//        userRepository.save(user1);
//
//        List<User> users = userRepository.findAll();
//
//        users.forEach(System.out::println);

//        // getOne
//        User user = userRepository.getOne(1L); // no Session 에러 발생, 세션을 유지하지 위해 @Transactional을 선언한다.
//
//        System.out.println(user);

//        // findById
//        User user = userRepository.findById(8L).orElse(null);
//
//        System.out.println(user);

//        // saveAndFlush
//        userRepository.saveAndFlush(new User("new jack", "jack@gmail.com"));
//
//        userRepository.findAll().forEach(System.out::println);

//        // count
//        long count = userRepository.count();
//
//        System.out.println(count);

//        // existsById
//        boolean exists = userRepository.existsById(8L);
//
//        System.out.println(exists);

//        // delete
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//
//        // deleteById
//        userRepository.deleteById(1L);

//        // deleteAll
//        userRepository.deleteAll();
//
//        userRepository.findAll().forEach(System.out::println);

//        // deleteAll
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//
//        userRepository.findAll().forEach(System.out::println);

//        // deleteInBatch (deleteAll을 하기에 너무 많은 레코드가 있을 때 사용, 레코드가 천만 건 이상 등등)
//        userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
//
//        userRepository.findAll().forEach(System.out::println);

//        // deleteAllInBatch (deleteAll을 하기에 너무 많은 레코드가 있을 때 사용, 레코드가 천만 건 이상 등등)
//        userRepository.deleteAllInBatch();
//
//        userRepository.findAll().forEach(System.out::println);

//        // 페이징
//        Page<User> users = userRepository.findAll(PageRequest.of(0, 3));
//
//        System.out.println("page: " + users);
//        System.out.println("totalElements: " + users.getTotalElements());
//        System.out.println("totalPages: " + users.getTotalPages());
//        System.out.println("numberOfElements: " + users.getNumberOfElements());
//        System.out.println("sort: " + users.getSort());
//        System.out.println("size: " + users.getSize());
//
//        users.getContent().forEach(System.out::println);

//        // Example (Query by example)
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name") // name은 제외
//                .withMatcher("email", endsWith()); // email에서 아래 선언한 example에서 gmail.com으로 끝나는 것
//
//        Example<User> example = Example.of(new User("ma", "gmail.com"), matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);

//        // Example (Query by example)
//        Example<User> example = Example.of(new User("Lee Taesung", "lts@gmail.com"));
//
//        userRepository.findAll(example).forEach(System.out::println);

        // Example (Query by example)
        User user = new User();
        user.setName("Lee");

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", contains()); // 양방향 like 검색
        Example<User> example = Example.of(user, matcher);

        userRepository.findAll(example).forEach(System.out::println);
    }
}