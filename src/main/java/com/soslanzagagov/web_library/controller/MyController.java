package com.soslanzagagov.web_library.controller;

import com.soslanzagagov.web_library.entity.Book;
import com.soslanzagagov.web_library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MyController {

    @Autowired
    LibraryService libraryService;

    @RequestMapping("/books")
    public String showAllBooks(Model model) {
        List<Book> books = libraryService.getAllBooks();
        model.addAttribute("allBooks", books);
        return "all-books";
    }

    @RequestMapping("/addBook")
    public String addBook(Model model) {
        Book book = new Book();
        model.addAttribute("newBook", book);
        return "book-info";
    }

    @RequestMapping("/saveBook")
    public String saveBook(@ModelAttribute("newBook") Book book) {
        if (book.getId() == 0) {
            libraryService.addBook(book);
        } else {
            libraryService.changeBook(book);
        }
        return "redirect:/books";
    }

    @RequestMapping("/updateBook")
    public String updateEmployee(@RequestParam("bookId") int id, Model model) {

        Book book = libraryService.getBook(id);
        model.addAttribute("newBook", book);
        return "book-info";
    }

    @RequestMapping("/deleteBook")
    public String deleteEmployee(@RequestParam("bookId") int id) {

        libraryService.deleteBook(id);
        return "redirect:/books";
    }
}
