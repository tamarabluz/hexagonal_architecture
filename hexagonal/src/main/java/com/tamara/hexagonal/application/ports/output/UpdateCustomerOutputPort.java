package com.tamara.hexagonal.application.ports.output;

import com.tamara.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
