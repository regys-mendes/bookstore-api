package com.regysmendes.bookstore.services;

import com.regysmendes.bookstore.dto.BookInsertDTO;
import com.regysmendes.bookstore.dto.BookResponseDTO;
import com.regysmendes.bookstore.dto.BookUpdateDTO;
import com.regysmendes.bookstore.entities.Book;
import com.regysmendes.bookstore.entities.BookStatus;
import com.regysmendes.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;


    public BookService(BookRepository repository) {
        this.repository = repository;
    }


    public List<BookResponseDTO> findAll(){
        List<Book> list = repository.findAll();
        List<BookResponseDTO> result = new ArrayList<>();

        for (Book book : list ){

            BookResponseDTO responseDTO = new BookResponseDTO(book.getId(), book.getTitle(), book.getAuthor(), book.getYear(), book.getStatus());
            result.add(responseDTO);
        }
        return result;
    }

    public Book findByIdentity(Long id){
        Optional<Book> book = repository.findById(id);
        return book.orElseThrow(() -> new IllegalArgumentException("Resource not found. Id"  + id));
    }

    public BookResponseDTO findById(Long id){
        Book book = findByIdentity(id);
        return new BookResponseDTO(book.getId(), book.getTitle(), book.getAuthor(), book.getYear(), book.getStatus());
    }

    public BookResponseDTO insert(BookInsertDTO book){
        Book newBook = new Book(null,  book.getTitle(), book.getAuthor(), book.getYear(), book.getStatus());
        repository.save(newBook);
        return new BookResponseDTO(newBook.getId(), newBook.getTitle(), newBook.getAuthor(), newBook.getYear(), newBook.getStatus());
    }

    public void delete(Long id){
        findByIdentity(id);
        repository.deleteById(id);
    }

    public BookResponseDTO update(Long id, BookUpdateDTO updateDTO){
        Book book = findByIdentity(id);
        updateData(book, updateDTO);
        repository.save(book);
        return new BookResponseDTO(book.getId(), book.getTitle(), book.getAuthor(), book.getYear(), book.getStatus());
    }

    public void updateData(Book book, BookUpdateDTO update){
        book.setTitle(update.getTitle());
        book.setAuthor(update.getAuthor());
        book.setYear(update.getYear());
    }

    public Book updateStatus(Long id, BookStatus newStatus){
        Book book = findByIdentity(id);
        book.setStatus(newStatus);
        return repository.save(book);
    }


}
