package com.tamara.hexagonal.adapters.input.consumer;

import com.tamara.hexagonal.adapters.input.consumer.mapper.CustomerMessageMapper;
import com.tamara.hexagonal.adapters.input.consumer.message.CustomerMessage;
import com.tamara.hexagonal.application.ports.input.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {
    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;
    @Autowired
    private CustomerMessageMapper customerMessageMapper;
    @KafkaListener(topics = "tp-cpf-validated", groupId = "tamara")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
