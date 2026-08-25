package com.regysmendes.bookstore.dto;

import com.regysmendes.bookstore.entities.BookStatus;

import java.time.LocalDate;

public class BookInsertDTO {

    private String title;
    private String author;
    private LocalDate year;
    private BookStatus status;

    public BookInsertDTO(){
    }

    public BookInsertDTO(String title, String author, LocalDate year, BookStatus status) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
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

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
