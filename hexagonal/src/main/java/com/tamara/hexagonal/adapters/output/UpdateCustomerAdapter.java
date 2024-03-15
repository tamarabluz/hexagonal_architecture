package com.tamara.hexagonal.adapters.output;

import com.tamara.hexagonal.adapters.output.repository.CustomerRepository;
import com.tamara.hexagonal.adapters.output.repository.mapper.CustomerEntityMapper;
import com.tamara.hexagonal.application.core.domain.Customer;
import com.tamara.hexagonal.application.ports.output.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
