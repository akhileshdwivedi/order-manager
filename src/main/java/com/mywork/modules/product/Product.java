package com.mywork.modules.product;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
@Setter(AccessLevel.NONE)
@Getter
@Builder(toBuilder = true)
public class Product {
    @Id
    private String id;

    @Field("product_id")
    private String productId;

    @Field("name")
    private String name;

    @Field("price")
    private Double price;
}
