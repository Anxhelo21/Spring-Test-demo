package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Books;
import org.springframework.data.repository.CrudRepository;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
