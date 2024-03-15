package com.tamara.hexagonal.adapters.input.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String name;
    private AddressResponse address;
    private String cpf;
    private boolean isValidCpf;

}
