/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ables.booksellers.repo;

import com.ables.booksellers.model.Book;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ables
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
 
  public Book findById(Long id);
 public List<Book> findByTitle(String title);
 public List<Book> findByAuthor(String author);
 public List<Book> findByPublisher(String publisher);
 public Book findByIsbn(String isbn);
 public List<Book> findByReleaseDate(SimpleDateFormat date);
 public List<Book> findByCategory(String category);
 
} 
