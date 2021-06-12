package com.mywork.web.rest;

import com.mywork.modules.order.OrderService;
import com.mywork.ordermanagement.spec.generated.rest.OrderApi;
import lombok.AllArgsConstructor;
import org.openapitools.model.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class OderApiAdapter implements OrderApi {
    private final OrderService orderService;

    @Override
    public ResponseEntity<List<OrderDto>> getOrdersByCustomerId(String customerId) {
       List<OrderDto> orderDtoList =  orderService.getOrdersByCustomerId(customerId);
       return ResponseEntity.ok(orderDtoList);
    }

    @Override
    public ResponseEntity<OrderDto> getOrderById(String oderId) {
        OrderDto orderDto = orderService.getOrderById(oderId);
        return ResponseEntity.ok(orderDto);
    }

    @Override
    public ResponseEntity<Void> createOrder(OrderDto orderDto) {
        orderService.createOrder(orderDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
