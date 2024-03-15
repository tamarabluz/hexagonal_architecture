package com.tamara.hexagonal.adapters.output;

import com.tamara.hexagonal.application.ports.output.SendCpfForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class SendCpfValidationAdapter implements SendCpfForValidationOutputPort {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void send(String cpf) {
        kafkaTemplate.send("tp-cpf-validation", cpf);
    }
}
