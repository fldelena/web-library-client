package com.soslanzagagov.web_library.service;

import com.soslanzagagov.web_library.entity.Book;

import java.util.List;

public interface LibraryService {

    List<Book> getAllBooks();

    Book getBook(int id);

    void addBook(Book book);

    void changeBook(Book book);

    void deleteBook(int id);
}
