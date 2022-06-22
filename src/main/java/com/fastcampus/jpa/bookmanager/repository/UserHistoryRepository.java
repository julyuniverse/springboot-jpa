package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lee Taesung
 * @since 6/22/22
 */
public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
}
