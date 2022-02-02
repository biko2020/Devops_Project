package org.openlab.openlapcustomerservice.services;

import org.openlab.openlapcustomerservice.dto.CustomerRequestDTO;
import org.openlab.openlapcustomerservice.dto.CustomerResponseDTO;
import org.openlab.openlapcustomerservice.entities.Customer;
import org.openlab.openlapcustomerservice.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public  CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {

        return null;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        return null;
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        return null;
    }
}
