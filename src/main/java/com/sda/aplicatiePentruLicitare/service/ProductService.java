package com.sda.aplicatiePentruLicitare.service;

import com.sda.aplicatiePentruLicitare.dto.ProductDto;
import com.sda.aplicatiePentruLicitare.model.Product;
import com.sda.aplicatiePentruLicitare.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void add(ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setStartBiddingPrice(Integer.valueOf(productDto.getStartBiddingPrice()));
        product.setEndDateTime(LocalDateTime.parse(productDto.getEndDateTime()));
        productRepository.save(product);
    }
}
