package com.regysmendes.bookstore.dto;

import java.time.LocalDate;

public class BookUpdateDTO {

    private String title;
    private String author;
    private LocalDate publicationYear;

   public BookUpdateDTO(){
   }

    public BookUpdateDTO(String title, String author, LocalDate publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
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
}
