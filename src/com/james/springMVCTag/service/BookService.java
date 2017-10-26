package com.james.springMVCTag.service;

import com.james.springMVCTag.entity.Book;
import com.james.springMVCTag.entity.Category;

import java.util.List;

public interface BookService {

    List<Category> getAllCategories();
    List<Book> getAllBooks();
    Category getCategory(int id);
    Book save(Book book);
    Book get(long id);
    Book update(Book book);
    long getNextid();
}
