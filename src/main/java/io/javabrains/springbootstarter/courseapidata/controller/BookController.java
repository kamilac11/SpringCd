package io.javabrains.springbootstarter.courseapidata.controller;

import io.javabrains.springbootstarter.courseapidata.model.Book;
import io.javabrains.springbootstarter.courseapidata.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBookList();
    }

    @RequestMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
            bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String id){
            bookService.updateBook(id, book);
        }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

    }

