package io.javabrains.springbootstarter.courseapidata.repository;


import io.javabrains.springbootstarter.courseapidata.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book, String> {
}
