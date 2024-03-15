package com.tamara.hexagonal.application.core.usecase;

import com.tamara.hexagonal.application.core.domain.Customer;
import com.tamara.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.tamara.hexagonal.application.ports.output.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}
