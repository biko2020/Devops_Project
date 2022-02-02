package org.openlab.openlapcustomerservice;

import org.openlab.openlapcustomerservice.dto.CustomerRequestDTO;
import org.openlab.openlapcustomerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpenlapCustomerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(OpenlapCustomerServiceApplication.class, args);
    }
    @Bean
   CommandLineRunner start(CustomerService customerService){
        return args -> {
            customerService.save(new CustomerRequestDTO());
        };
   }
}
