package com.regysmendes.bookstore.resources;

import com.regysmendes.bookstore.dto.BookResponseDTO;
import com.regysmendes.bookstore.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
