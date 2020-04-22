package com.springguru.spring5WebApp.controllers;

import com.springguru.spring5WebApp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/allBooks")
    public String getBooks(Model model)
    {
       model.addAttribute("books",this.bookRepository.findAll());
       return "listBook";
    }
}
