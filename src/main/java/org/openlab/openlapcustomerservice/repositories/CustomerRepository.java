package org.openlab.openlapcustomerservice.repositories;

import org.openlab.openlapcustomerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {

}
