package com.mywork.modules.product;

import org.openapitools.model.ProductDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {
    public ProductDto toDto(Product  product){
        return new ProductDto()
                .productId(product.getProductId())
                .name(product.getName())
                .price(BigDecimal.valueOf(product.getPrice()));
    }

    public Product toEntity(ProductDto productDto){
        return Product.builder()
                .productId(productDto.getProductId())
                .name(productDto.getName())
                .price(productDto.getPrice().doubleValue())
                .build();
    }

    public List<ProductDto> toProductDtoList(List<Product> productList){
        List<ProductDto> productDtoList = new ArrayList<>();

        for(Product product: productList){
                productDtoList.add(
                        new ProductDto()
                                .productId(product.getProductId())
                                .name(product.getName())
                                .price(BigDecimal.valueOf(product.getPrice()))
                );
        }
        return productDtoList;
    }

    public List<Product> toProductEntityList(List<ProductDto> productDtoList){
        List<Product> productEntityList = new ArrayList<>();

        for(ProductDto productDto: productDtoList){
            productEntityList.add(
                    Product.builder()
                            .productId(productDto.getProductId())
                            .name(productDto.getName())
                            .price(productDto.getPrice().doubleValue())
                            .build()
            );
        }
        return productEntityList;
    }
}
