package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Lee Taesung
 * @since 6/22/22
 */

@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void bookTest() {
        Book book = new Book();
        book.setName("JPA 초격차 패키지");
        book.setAuthorId(1L);
        book.setPublisherId(1l);

        bookRepository.save(book);

        System.out.println(bookRepository.findAll());
    }
}
