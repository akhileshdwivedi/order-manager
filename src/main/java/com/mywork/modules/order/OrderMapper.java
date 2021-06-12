package com.mywork.modules.order;

import com.mywork.modules.product.ProductMapper;
import lombok.AllArgsConstructor;
import org.openapitools.model.OrderDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class OrderMapper {
    private final ProductMapper productMapper;

    public List<OrderDto> toDtoList(List<Order> orderList){
        List<OrderDto> orderDtoList = new ArrayList<>(orderList.size());
        for (Order order :orderList){
            orderDtoList.add(
                    new OrderDto()
                            .orderId(order.getOrderId())
                            .customerId(order.getCustomerId())
                            .products(productMapper.toProductDtoList(order.getProducts()))
            );
        }
        return orderDtoList;
    }

    public Order toEntity(OrderDto orderDto) {
        return Order.builder()
                .orderId(orderDto.getOrderId())
                .customerId(orderDto.getCustomerId())
                .products(productMapper.toProductEntityList(orderDto.getProducts()))
                .build();
    }

    public OrderDto toDto(Order order){
        return new OrderDto()
                .orderId(order.getOrderId())
                .customerId(order.getCustomerId())
                .products(productMapper.toProductDtoList(order.getProducts()));
    }
}
