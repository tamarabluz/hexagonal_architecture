package com.tamara.hexagonal.application.ports.input;

import com.tamara.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
