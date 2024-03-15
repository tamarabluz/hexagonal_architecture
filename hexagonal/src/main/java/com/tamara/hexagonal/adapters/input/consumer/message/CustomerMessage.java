package com.tamara.hexagonal.adapters.input.consumer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {

    private String id;
    private String name;
    private  String ZipCode;
    private String cpf;
    private boolean isValidCpf;
}
