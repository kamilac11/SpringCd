package io.javabrains.springbootstarter.courseapidata.controller;

import io.javabrains.springbootstarter.courseapidata.model.Book;
import io.javabrains.springbootstarter.courseapidata.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBookList();
    }

    @RequestMapping("/books/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
            bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable int id){
            bookService.updateBook(id, book);
        }

    //to nie dziala wgl
//    @RequestMapping(method = RequestMethod.PUT, value = "/books")
//    public void updateBook(@RequestBody Book book){
//        bookService.updateBook(book);
//    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
    }

    @RequestMapping("/save")
    public void save(){
        Book book = new Book("Aaaaaa", "aaaaa", 123, "aaaaa");
        Book book2 = new Book("Ccccc", "ccccc", 123, "aaaaa");
        Book book3 = new Book("Bbbbbb", "bbbbb", 123, "aabbbbbbaaa");
        bookService.addBook(book);
        bookService.addBook(book2);
        bookService.addBook(book3);
    }
    @RequestMapping("/books/cover/{bookCover}")
    public List<Book> getBooks(@PathVariable String bookCover) {
        return bookService.getBookListByBookCover(bookCover);
    }

    @RequestMapping("/books/cover")
    public List<Book> getBooksByCover(@RequestBody List<String> bookCover) {
        List<Book>books = new ArrayList<>();
        for (String s : bookCover) {
            books.addAll(bookService.getBookListByBookCover(s));
        }
        return books;
    }


    }



