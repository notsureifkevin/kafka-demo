package com.instana.kafka.demo.customerservice.customer;

import java.util.List;

import com.instana.kafka.demo.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}