package com.tamara.hexagonal.config;

import com.tamara.hexagonal.adapters.output.FindAddressByZipCodeAdapter;
import com.tamara.hexagonal.adapters.output.UpdateCustomerAdapter;
import com.tamara.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.tamara.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressZipCodeAdapter, updateCustomerAdapter);
    }
}
