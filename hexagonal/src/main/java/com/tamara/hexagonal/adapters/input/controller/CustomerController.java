package com.tamara.hexagonal.adapters.input.controller;

import com.tamara.hexagonal.adapters.input.controller.mapper.CustomerMapper;
import com.tamara.hexagonal.adapters.input.controller.request.CustomerRequest;
import com.tamara.hexagonal.adapters.input.controller.response.CustomerResponse;
import com.tamara.hexagonal.application.core.domain.Customer;
import com.tamara.hexagonal.application.ports.input.DeleteCustomerByIdInputPort;
import com.tamara.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.tamara.hexagonal.application.ports.input.InsertCustomerInputPort;
import com.tamara.hexagonal.application.ports.input.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;
    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;
    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void>insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update( @PathVariable final String id,
                                        @Valid @RequestBody CustomerRequest customerRequest){
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
