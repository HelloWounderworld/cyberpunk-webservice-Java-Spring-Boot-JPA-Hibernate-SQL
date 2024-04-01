package com.cyberpunkdesignbank.cyberpunk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberpunkdesignbank.cyberpunk.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
