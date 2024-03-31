package com.cyberpunkdesignbank.cyberpunk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberpunkdesignbank.cyberpunk.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
