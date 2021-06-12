package com.mywork.modules.order;

import org.openapitools.model.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrdersByCustomerId(String customerId);
    void createOrder(OrderDto orderDto);
    OrderDto getOrderById(String oderId);
}
