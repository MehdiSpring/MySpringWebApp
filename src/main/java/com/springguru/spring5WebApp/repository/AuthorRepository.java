package com.springguru.spring5WebApp.repository;

import com.springguru.spring5WebApp.domaine.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
