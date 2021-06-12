package com.mywork.web.rest;

import com.mywork.modules.customer.CustomerService;
import com.mywork.ordermanagement.spec.generated.rest.CustomerApi;
import lombok.AllArgsConstructor;
import org.openapitools.model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CustomerApiAdapter implements CustomerApi {
    private final CustomerService customerService;

    @Override
    public ResponseEntity<Void> createCustomer(CustomerDto customerDto) {
        customerService.createCustomer(customerDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
