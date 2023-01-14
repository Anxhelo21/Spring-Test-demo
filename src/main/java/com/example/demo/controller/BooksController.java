package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Books;
import com.example.demo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/book")
    private List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookId}")
    private Books getBooks(@PathVariable("bookId") int bookId) {
        return booksService.getBooksById(bookId);
    }

    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId) {
        booksService.delete(bookId);
    }

    @PostMapping("/books")
    private Books saveBook(@RequestBody Books books) {
        return booksService.save(books);
    }

    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.save(books);
        return books;
    }
}