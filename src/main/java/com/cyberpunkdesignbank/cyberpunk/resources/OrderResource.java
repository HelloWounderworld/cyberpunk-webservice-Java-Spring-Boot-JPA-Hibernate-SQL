package com.cyberpunkdesignbank.cyberpunk.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyberpunkdesignbank.cyberpunk.entities.Order;
import com.cyberpunkdesignbank.cyberpunk.repositories.OrderRepository;
import com.cyberpunkdesignbank.cyberpunk.services.OrderService;

@RestController
@RequestMapping(path="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List> findAll() {
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
