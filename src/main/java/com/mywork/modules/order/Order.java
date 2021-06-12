package com.mywork.modules.order;

import com.mywork.modules.product.Product;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "order")
@Setter(AccessLevel.NONE)
@Builder(toBuilder = true)
@Getter
public class Order {
    @Id
    private String id;

    @Field("order_id")
    private String orderId;

    @Field("customer_id")
    private String customerId;

    @Field("products")
    private List<Product> products;
}
