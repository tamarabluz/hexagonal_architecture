package com.tamara.hexagonal.application.ports.output;

import com.tamara.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
