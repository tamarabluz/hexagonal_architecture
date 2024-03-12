package com.tamara.hexagonal.application.ports.output;

import com.tamara.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
