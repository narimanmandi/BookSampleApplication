package com.example.demo.service;

import com.example.demo.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BookService extends GenericService<Book, String> {

    Page<Book> findAll(Pageable pageable);
}
