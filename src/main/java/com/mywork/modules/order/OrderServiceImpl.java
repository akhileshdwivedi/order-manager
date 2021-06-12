package com.mywork.modules.order;

import com.mywork.OrderManagementServiceApplication;
import com.mywork.modules.product.Product;
import lombok.AllArgsConstructor;
import org.openapitools.model.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public List<OrderDto> getOrdersByCustomerId(String customerId){
        List<Order> orders = orderRepository.findOrdersByCustomerId(customerId);
        return orderMapper.toDtoList(orders);
    }

    public void createOrder(OrderDto orderDto) {
       Order order =  orderMapper.toEntity(orderDto);
       orderRepository.save(order);
    }

    public OrderDto getOrderById(String oderId) {
        return orderRepository.findOrderByOrderId(oderId)
               .map(orderMapper::toDto)
               .orElse(null);
    }
}
