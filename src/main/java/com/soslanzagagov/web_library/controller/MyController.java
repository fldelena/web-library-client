package com.soslanzagagov.web_library.controller;

import com.soslanzagagov.web_library.entity.Book;
import com.soslanzagagov.web_library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MyController {

    @Autowired
    LibraryService libraryService;

    @RequestMapping("/books")
    public String showAllBooks(Model model){
        List<Book> books = libraryService.getAllBooks();
        model.addAttribute("allBooks", books);
        return "all-books";
    }

}
