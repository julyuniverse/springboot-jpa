package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lee Taesung
 * @since 6/29/22
 */
public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}
