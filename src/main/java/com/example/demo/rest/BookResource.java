package com.example.demo.rest;

import com.example.demo.domain.Book;
import com.example.demo.dto.book.BookDto;
import com.example.demo.dto.book.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookResource {

    @Autowired
    private BookService bookService;


    @GetMapping("/{id}")
    public ResponseEntity<BookDto> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(BookMapper.INSTANCE.toDto(bookService.findById(id)));
    }

    @GetMapping
    public ResponseEntity<Page<BookDto>> get(Pageable pageable) {
        return ResponseEntity.ok((bookService.findAll(pageable).map(BookMapper.INSTANCE::toDto)));
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody BookDto bookDto) {
        return ResponseEntity.ok(bookService.save(BookMapper.INSTANCE.toEntity(bookDto)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> edit(@RequestBody BookDto bookDto) {
        return ResponseEntity.ok(bookService.save(BookMapper.INSTANCE.toEntity(bookDto)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String id) throws Exception {
        bookService.delete(id);
        return ResponseEntity.ok("book deleted");
    }
}
