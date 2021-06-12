package com.mywork.web.rest;

import com.mywork.modules.product.ProductService;
import com.mywork.ordermanagement.spec.generated.rest.ProductApi;
import lombok.RequiredArgsConstructor;
import org.openapitools.model.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductApiAdapter implements ProductApi {

    private final ProductService productService;

    @Override
    public ResponseEntity<ProductDto> getProductDetails(String productId) {
        ProductDto productDto = productService.getProductById(productId);
        return ResponseEntity.ok(productDto);
    }

    @Override
    public ResponseEntity<Void> createProduct(ProductDto productDto) {
        productService.createProduct(productDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
