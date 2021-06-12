package com.mywork.modules.order;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends MongoRepository<Order,String > {
    List<Order> findOrdersByCustomerId(String customerId);
    Optional<Order> findOrderByOrderId(String orderId);
}