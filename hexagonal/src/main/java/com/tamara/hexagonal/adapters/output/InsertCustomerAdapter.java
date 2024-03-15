package com.tamara.hexagonal.adapters.output;

import com.tamara.hexagonal.adapters.output.repository.CustomerRepository;
import com.tamara.hexagonal.adapters.output.repository.mapper.CustomerEntityMapper;
import com.tamara.hexagonal.application.core.domain.Customer;
import com.tamara.hexagonal.application.ports.output.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public void insert(Customer customer) {
        var customeEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customeEntity);

    }
}
