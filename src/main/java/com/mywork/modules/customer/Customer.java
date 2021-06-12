package com.mywork.modules.customer;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customer")
@Setter(AccessLevel.NONE)
@Getter
@Builder(toBuilder = true)
public class Customer {
    @Id
    private String id;

    @Field("customer_id")
    private String customerId;

    @Field("name")
    private String name;
}
