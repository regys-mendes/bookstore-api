package com.regysmendes.bookstore.dto;

import com.regysmendes.bookstore.entities.Book;
import com.regysmendes.bookstore.entities.BookStatus;

import java.time.LocalDate;
import java.util.Objects;

public class BookResponseDTO {

    private Long id;
    private String title;
    private String author;
    private LocalDate publicationYear;

    private BookStatus status;

    public BookResponseDTO(){
    }

    public BookResponseDTO(Long id, String title, String author, LocalDate publicationYear, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookResponseDTO book = (BookResponseDTO) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
