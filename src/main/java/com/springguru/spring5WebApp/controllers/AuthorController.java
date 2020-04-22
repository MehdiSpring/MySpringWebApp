package com.springguru.spring5WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springguru.spring5WebApp.repository.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository authorRepository;
	
	public AuthorController(AuthorRepository authorRepository)
	{
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/allAuthors")
	public String getAuthors(Model model)
	{
		model.addAttribute("authors", this.authorRepository.findAll());
		return "listAuthor";
	}
}
