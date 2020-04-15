package com.module.SpringbootEX.repositories;

import com.module.SpringbootEX.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
