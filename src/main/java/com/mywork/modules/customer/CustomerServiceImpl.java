package com.mywork.modules.customer;

import lombok.AllArgsConstructor;
import org.openapitools.model.CustomerDto;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    public void createCustomer(CustomerDto customerDto) {
        Customer customer =  customerMapper.toEntity(customerDto);
        customerRepository.save(customer);
    }
}
