package com.tamara.hexagonal.adapters.output.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {

    private String street;
    private String city;
    private String state;
}
