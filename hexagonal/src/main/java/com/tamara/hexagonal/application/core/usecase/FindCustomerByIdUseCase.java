package com.tamara.hexagonal.application.core.usecase;

import com.tamara.hexagonal.application.core.domain.Customer;
import com.tamara.hexagonal.application.ports.output.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase {
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}
