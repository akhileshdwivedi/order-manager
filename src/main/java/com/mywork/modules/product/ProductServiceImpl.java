package com.mywork.modules.product;

import lombok.AllArgsConstructor;
import org.openapitools.model.ProductDto;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductDto getProductById(String productId){
        return productRepository.findByProductId(productId)
                .map(productMapper::toDto)
                .orElse(null);
    }

    public void createProduct(ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        productRepository.save(product);
    }
}

