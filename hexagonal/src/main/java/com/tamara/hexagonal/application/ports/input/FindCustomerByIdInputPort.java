package com.tamara.hexagonal.application.ports.input;

import com.tamara.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
