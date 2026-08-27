package com.regysmendes.bookstore.dto;

import java.time.LocalDate;

public class BookUpdateDTO {

    private String title;
    private String author;
    private LocalDate year;

   public BookUpdateDTO(){
   }

    public BookUpdateDTO(String title, String author, LocalDate year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
}
