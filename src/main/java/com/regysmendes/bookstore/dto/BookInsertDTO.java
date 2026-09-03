package com.regysmendes.bookstore.dto;

import com.regysmendes.bookstore.entities.BookStatus;

import java.time.LocalDate;

public class BookInsertDTO {

    private String title;
    private String author;
    private LocalDate publicationYear;
    private BookStatus status;

    public BookInsertDTO(){
    }

    public BookInsertDTO(String title, String author, LocalDate publicationYear, BookStatus status) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
