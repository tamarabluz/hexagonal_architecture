package com.tamara.hexagonal.adapters.output.repository.mapper;

import com.tamara.hexagonal.adapters.output.repository.entities.CustomerEntity;
import com.tamara.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
