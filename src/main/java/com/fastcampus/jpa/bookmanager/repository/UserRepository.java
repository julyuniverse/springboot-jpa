package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
    // =
    Optional<User> findByName(String name);

    // =
    Set<User> findUserByNameIs(String name);

    // =
    Set<User> findUserByName(String name);

    // =
    Set<User> findUserByNameEquals(String name);

    User findByEmail(String email);

    User getByEmail(String email);

    User readByEmail(String email);

    User queryByEmail(String email);

    User searchByEmail(String email);

    User streamByEmail(String email);

    User findUserByEmail(String email);

    User findSomethingByEmail(String email);

    // limit
    User findFirst1ByName(String name);

    // limit
    List<User> findTop2ByName(String name);

    // and
    List<User> findByEmailAndName(String email, String name);

    // or
    List<User> findByEmailOrName(String email, String name);

    // >
    List<User> findByCreatedAtAfter(LocalDateTime yesterday);

    // >
    List<User> findByIdAfter(Long id);

    // <
    List<User> findByIdBefore(Long id);

    // >
    List<User> findByCreatedAtGreaterThan(LocalDateTime yesterday);

    // >=
    List<User> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);

    // <
    List<User> findByCreatedAtLessThan(LocalDateTime today);

    // <=
    List<User> findByCreatedAtLessThanEqual(LocalDateTime today);

    // between
    List<User> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);

    // between
    List<User> findByIdBetween(Long id1, Long id2);

    // >= <=
    List<User> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);

    // not null
    List<User> findByIdIsNotNull();

    // in
    List<User> findByNameIn(List<String> names);

    // like *%
    List<User> findByNameStartingWith(String name);

    // like %*
    List<User> findByNameEndingWith(String name);

    // like %*%
    List<User> findByNameContains(String name);

    // like
    List<User> findByNameLike(String name);

    // limit 1
    List<User> findTop1ByName(String name);

    // limit 1 order by desc
    List<User> findTop1ByNameOrderByIdDesc(String name);

    // limit order by
    List<User> findFirstByNameOrderByIdDescEmailAsc(String name);

    // limit
    List<User> findFirstByName(String name, Sort sort);

    // limit ? offset ?
    Page<User> findByName(String name, Pageable pageable);

    @Query(value = "select * from user limit 1;", nativeQuery = true)
    Map<String, Object> findRawRecord();
}
