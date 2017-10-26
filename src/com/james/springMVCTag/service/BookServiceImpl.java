package com.james.springMVCTag.service;


import com.james.springMVCTag.entity.Book;
import com.james.springMVCTag.entity.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

private List<Category>  categories;
private List<Book> books;

public BookServiceImpl(){
    categories=new ArrayList<>();
    Category category1=new Category(1,"Computing");
    Category category2=new Category(2,"Travel");
    Category category3=new Category(3,"Health");

    categories.add(category1);
    categories.add(category2);
    categories.add(category3);

    books=new ArrayList<>();
    Book book1=new Book(1L,"9780980839623","Servelt & JSP",category1,"Paul Deck");
    Book book2=new Book(2L,"978098039630","C#",category1,"Jayden Ky");
    books.add(book1);
    books.add(book2);
}

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public Category getCategory(int id) {
        return categories.get(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book save(Book book) {
    book.setId(getNextid());
    books.add(book);
    return book;
    }

    @Override
    public Book get(long id) {
    for(Book book:books){
        if (id==book.getId()){
            return book;
        }
    }
    return null;

    }

    @Override
    public Book update(Book book) {
    int bookCount=books.size();
    for(int i=0;i<bookCount;i++){
        Book saveBook=books.get(i);
        if(saveBook.getId()==book.getId()){
            books.set(i,book);
            return book;
        }
    }
    return book;
    }

    @Override
    public long getNextid() {
        long id=0L;
        for (Book book:books){
            long bookId=book.getId();
            if (bookId>id){
                id=bookId;
            }
        }
        return id+1;
    }
}
