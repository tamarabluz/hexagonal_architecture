package com.tamara.hexagonal.config;

import com.tamara.hexagonal.adapters.output.FindAddressByZipCodeAdapter;
import com.tamara.hexagonal.adapters.output.InsertCustomerAdapter;
import com.tamara.hexagonal.adapters.output.SendCpfValidationAdapter;
import com.tamara.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter,
                                                       SendCpfValidationAdapter  sendCpfValidationAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
