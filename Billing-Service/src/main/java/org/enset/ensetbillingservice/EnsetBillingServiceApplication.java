package org.enset.ensetbillingservice;

import org.enset.ensetbillingservice.dto.InvoiceRequestDTO;
import org.enset.ensetbillingservice.services.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients

public class EnsetBillingServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(EnsetBillingServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(InvoiceService invoiceService){
        return args ->{
            invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(98000),"C001"));
            invoiceService.save(new InvoiceRequestDTO(BigDecimal.valueOf(97000),"C002"));
        };
    }

}
