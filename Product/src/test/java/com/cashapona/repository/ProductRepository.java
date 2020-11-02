package com.cashapona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cashapona.demo.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
 
}