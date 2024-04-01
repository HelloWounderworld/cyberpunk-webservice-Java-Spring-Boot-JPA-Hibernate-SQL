package com.cyberpunkdesignbank.cyberpunk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberpunkdesignbank.cyberpunk.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
