package com.bittercode.service;

import java.util.List;

import com.bittercode.model.Book;

public interface BookService {

    public List<Book> getAllBooks();
    
    public List<Book> getBooksByCommaSeperatedBookIds(String commaSeperatedBookIds);

    public String deleteBookById(String bookId) ;
    
    public String addBook(Book book);
    
    public String updateBookQtyById(String bookId, int quantity);
}
