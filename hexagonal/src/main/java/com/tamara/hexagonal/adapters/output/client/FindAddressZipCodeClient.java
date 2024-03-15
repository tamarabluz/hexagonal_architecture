package com.tamara.hexagonal.adapters.output.client;

import com.tamara.hexagonal.adapters.output.client.response.AddressResponse;
import com.tamara.hexagonal.application.core.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FindAddressZipCodeClient",
        url = "${tamara.client.address.url")
public interface FindAddressZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode")String zipCode);
}

