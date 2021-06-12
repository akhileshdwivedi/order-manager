package com.mywork.modules.customer;

import org.openapitools.model.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public Customer toEntity(CustomerDto customerDto){
        return Customer.builder()
                .customerId(customerDto.getCustomerId())
                .name(customerDto.getName())
                .build();
    }

    public CustomerDto toDto(Customer customer){
        return new CustomerDto()
                .customerId(customer.getCustomerId())
                .name(customer.getName());
    }
}
