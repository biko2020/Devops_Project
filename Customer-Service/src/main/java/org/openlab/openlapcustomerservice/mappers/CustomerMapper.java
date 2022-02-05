package org.openlab.openlapcustomerservice.mappers;

import org.mapstruct.Mapper;
import org.openlab.openlapcustomerservice.dto.CustomerRequestDTO;
import org.openlab.openlapcustomerservice.dto.CustomerResponseDTO;
import org.openlab.openlapcustomerservice.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOCustomer(CustomerRequestDTO customerRequestDTO);

}
