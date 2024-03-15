package com.tamara.hexagonal.application.ports.output;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
