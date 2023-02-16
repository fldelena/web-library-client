package com.soslanzagagov.web_library.server_layer_link;

import com.soslanzagagov.web_library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class LibraryServerImpl implements LibraryServer {

    @Autowired
    RestTemplate restTemplate;
    private static final String URL = "http://localhost:8080/web_library_rest/api/books";


    @Override
    public List<Book> getAllBooks() {
        ResponseEntity<List<Book>> response = restTemplate.exchange(URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<List<Book>>() {
                });
        List<Book> books = response.getBody();
        return books;
    }

    @Override
    public Book getBook(int id) {
        Book book = restTemplate.getForObject(URL + "/" + id, Book.class);
        return book;
    }

    @Override
    public void addBook(Book book) {
        ResponseEntity<String> response = restTemplate.postForEntity(URL, book, String.class);
        System.out.println(response.getBody());
    }

    @Override
    public void changeBook(Book book) {
        restTemplate.put(URL, book);
    }

    @Override
    public void deleteBook(int id) {
        restTemplate.delete(URL + "/" + id);
    }
}
