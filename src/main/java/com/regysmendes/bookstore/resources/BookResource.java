package com.regysmendes.bookstore.resources;

import com.regysmendes.bookstore.dto.BookInsertDTO;
import com.regysmendes.bookstore.dto.BookResponseDTO;
import com.regysmendes.bookstore.entities.Book;
import com.regysmendes.bookstore.entities.BookStatus;
import com.regysmendes.bookstore.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

    private final BookService service;

    public BookResource(BookService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> findAll(){
       List<BookResponseDTO> responseDTO = service.findAll();
       return ResponseEntity.ok().body(responseDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BookResponseDTO> findById(@PathVariable Long id){
        BookResponseDTO responseDTO = service.findById(id);
        return ResponseEntity.ok().body(responseDTO);
    }

    @PatchMapping(value = "/status/{id}")
    public ResponseEntity<Book> updateStatus(@PathVariable Long id, BookStatus status){
        Book book = service.updateStatus(id, status);
        return ResponseEntity.ok().body(book);
    }


    @PostMapping
    public ResponseEntity<BookResponseDTO> insert(@RequestBody BookInsertDTO insertDTO){
        BookResponseDTO responseDTO = service.insert(insertDTO);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(responseDTO.getId())
                .toUri();

        return ResponseEntity.created(uri).body(responseDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable  Long id){
        service.deleteById(id);
      return ResponseEntity.noContent().build();
    }

}
