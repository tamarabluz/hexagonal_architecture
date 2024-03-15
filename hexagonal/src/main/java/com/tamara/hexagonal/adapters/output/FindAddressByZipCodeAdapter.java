package com.tamara.hexagonal.adapters.output;

import com.tamara.hexagonal.adapters.output.client.FindAddressZipCodeClient;
import com.tamara.hexagonal.adapters.output.client.mapper.AddressResponseMapper;
import com.tamara.hexagonal.adapters.output.client.response.AddressResponse;
import com.tamara.hexagonal.application.core.domain.Address;
import com.tamara.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressZipCodeClient findAddressZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
