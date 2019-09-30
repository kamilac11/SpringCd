package io.javabrains.springbootstarter.courseapidata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    //spring -boot starter test depenedcy

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private int year;
    private String bookCover;

    public Book() {

    }


    public Book(int id, String title, String author, int year, String bookCover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.bookCover = bookCover;

    }

    public Book(String title, String author, int year, String bookCover) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.bookCover = bookCover;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;

    }

}
