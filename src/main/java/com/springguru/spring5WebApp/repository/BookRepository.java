package com.springguru.spring5WebApp.repository;

import com.springguru.spring5WebApp.domaine.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
