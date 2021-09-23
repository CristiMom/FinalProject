package com.sda.aplicatiePentruLicitare.repository;

import com.sda.aplicatiePentruLicitare.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
