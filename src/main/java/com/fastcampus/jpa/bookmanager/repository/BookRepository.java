package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lee Taesung
 * @since 6/22/22
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
