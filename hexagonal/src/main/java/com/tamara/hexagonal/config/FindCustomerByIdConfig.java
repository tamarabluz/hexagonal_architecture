package com.tamara.hexagonal.config;

import com.tamara.hexagonal.adapters.output.FindAddressByZipCodeAdapter;
import com.tamara.hexagonal.adapters.output.FindCustomerByIdAdapter;
import com.tamara.hexagonal.adapters.output.InsertCustomerAdapter;
import com.tamara.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.tamara.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {
    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
