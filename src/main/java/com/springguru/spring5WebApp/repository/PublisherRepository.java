package com.springguru.spring5WebApp.repository;

import com.springguru.spring5WebApp.domaine.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
