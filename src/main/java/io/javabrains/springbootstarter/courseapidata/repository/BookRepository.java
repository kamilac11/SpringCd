package io.javabrains.springbootstarter.courseapidata.repository;


import io.javabrains.springbootstarter.courseapidata.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer>{


//    @Query("select book from io.javabrains.springbootstarter.courseapidata.model.Book book where book.bookCover = :bookCover")
    public List<Book> findByBookCoverIgnoreCaseContaining(String bookCover);

}

