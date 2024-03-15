package com.tamara.hexagonal.adapters.output.repository;

import com.tamara.hexagonal.adapters.output.repository.entities.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
