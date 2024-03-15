package com.tamara.hexagonal.config;

import com.tamara.hexagonal.adapters.output.DeleteCustomerByIdAdapter;
import com.tamara.hexagonal.adapters.output.FindCustomerByIdAdapter;
import com.tamara.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.tamara.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                               DeleteCustomerByIdAdapter deleteCustomerByIdAdapter){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
