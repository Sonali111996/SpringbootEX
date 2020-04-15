package com.module.SpringbootEX.repositories;

import com.module.SpringbootEX.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
