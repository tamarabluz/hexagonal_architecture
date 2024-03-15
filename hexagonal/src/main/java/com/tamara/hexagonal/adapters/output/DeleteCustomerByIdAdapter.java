package com.tamara.hexagonal.adapters.output;

import com.tamara.hexagonal.adapters.output.repository.CustomerRepository;
import com.tamara.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
