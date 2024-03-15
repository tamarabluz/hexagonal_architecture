package com.tamara.hexagonal.adapters.output.client.mapper;

import com.tamara.hexagonal.adapters.output.client.response.AddressResponse;
import com.tamara.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
