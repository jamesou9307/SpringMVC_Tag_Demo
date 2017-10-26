package com.james.springMVCTag.entity;

import java.io.Serializable;

public class Book implements Serializable{

    private static final long serialVersionUID=1520961851058396786L;
    private long id;
    private String isbn;
    private Category category;
    private String title;
    private String author;

    public Book() {
    }

    public Book(long id, String isbn,String title, Category category,  String author) {
        this.id = id;
        this.isbn = isbn;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
