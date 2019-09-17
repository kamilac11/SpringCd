package io.javabrains.springbootstarter.courseapidata.service;

import io.javabrains.springbootstarter.courseapidata.model.Book;
import io.javabrains.springbootstarter.courseapidata.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBookList() {
        List<Book> books = new ArrayList(bookRepository.findAll());
        return books;
    }

    public Optional<io.javabrains.springbootstarter.courseapidata.model.Book> getBook(int id) {
        return bookRepository.findById(id);
    }

    //library can add new book to their collection
    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(int id, Book book){
       bookRepository.findById(id).ifPresent(bookExist -> {
           bookRepository.save(book);
       });
    }

    public void deleteBook(int id){
        bookRepository.deleteById(id);
    }

}
