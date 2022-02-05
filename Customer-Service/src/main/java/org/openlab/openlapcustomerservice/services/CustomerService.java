package org.openlab.openlapcustomerservice.services;

import org.openlab.openlapcustomerservice.dto.CustomerRequestDTO;
import org.openlab.openlapcustomerservice.dto.CustomerResponseDTO;
import org.openlab.openlapcustomerservice.entities.Customer;

import java.util.List;

public interface CustomerService {

    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String id);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> listCustomers();

}
