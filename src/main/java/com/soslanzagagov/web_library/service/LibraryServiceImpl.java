package com.soslanzagagov.web_library.service;

import com.soslanzagagov.web_library.server_layer_link.LibraryServer;
import com.soslanzagagov.web_library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    LibraryServer libraryServer;


    @Override
    public List<Book> getAllBooks() {
        return libraryServer.getAllBooks();
    }

    @Override
    public Book getBook(int id) {
        return libraryServer.getBook(id);
    }

    @Override
    public void addBook(Book book) {
        libraryServer.addBook(book);
    }

    @Override
    public void changeBook(Book book) {
        libraryServer.changeBook(book);
    }

    @Override
    public void deleteBook(int id) {
        libraryServer.deleteBook(id);
    }
}
