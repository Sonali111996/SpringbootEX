package com.module.SpringbootEX.repositories;

import com.module.SpringbootEX.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
