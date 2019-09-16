package io.javabrains.springbootstarter.courseapidata.service;

import io.javabrains.springbootstarter.courseapidata.model.Topic;
import io.javabrains.springbootstarter.courseapidata.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBookList() {
        //List<Book> books = new ArrayList<>();
       // bookRepository.findAll();
        List<Book> books = new ArrayList(bookRepository.findAll());
        return books;

    }

}
