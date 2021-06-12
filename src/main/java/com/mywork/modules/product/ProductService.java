package com.mywork.modules.product;

import org.openapitools.model.ProductDto;

public interface ProductService {
    ProductDto getProductById(String productId);
    void createProduct(ProductDto productDto);
}
