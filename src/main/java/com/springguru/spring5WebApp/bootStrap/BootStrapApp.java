package com.springguru.spring5WebApp.bootStrap;

import com.springguru.spring5WebApp.domaine.Author;
import com.springguru.spring5WebApp.domaine.Book;
import com.springguru.spring5WebApp.domaine.Publisher;
import com.springguru.spring5WebApp.repository.AuthorRepository;
import com.springguru.spring5WebApp.repository.BookRepository;
import com.springguru.spring5WebApp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapApp implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapApp(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author victor = new Author("victor","Hugo");
        Book leDernierJour = new Book("Le dernier jour","12321");
       // Book bookDeTest = new Book();

        Publisher publisher = new Publisher("Address 1","city 1","State 1"," zip 1");

        this.publisherRepository.save(publisher);

        victor.getBooks().add(leDernierJour);
        leDernierJour.getAuthors().add(victor);

        leDernierJour.setPublisher(publisher);
        publisher.getBooks().add(leDernierJour);
        //publisher.getBooks().add(bookDeTest);



        this.authorRepository.save(victor);
        this.bookRepository.save(leDernierJour);
        this.publisherRepository.save(publisher);





       // this.bookRepository.save(bookDeTest);


        System.out.println("***** Started in BootStrap ******");
        System.out.println(("Le nombre de books est : "+this.bookRepository.count()));
        System.out.println("Le nombre de book par publisher est : "+publisher.getBooks().size());

    }
}
