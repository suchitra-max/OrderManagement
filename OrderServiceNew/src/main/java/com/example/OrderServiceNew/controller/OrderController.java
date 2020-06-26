package com.example.OrderServiceNew.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.OrderServiceNew.Dao.OrderEntity;
import com.example.OrderServiceNew.Dao.OrderRepository;

@RestController
public class OrderController {
	  @Autowired 
	  OrderRepository repository;
	 
	
	
	@GetMapping("/retrieve1")
	public String retrieveOrder() {
		
		return "xyzz";
		//return new OrderEntity(1,"aaa","xyz","Manikonda");
		
	}
	@GetMapping("/retrieve/{id}")
	public OrderEntity retrieveCustomerOrder(@PathVariable int id) {
		
		Optional<OrderEntity> orderEntity=repository.findById((long) id);
		if(orderEntity.isPresent()) {
			return orderEntity.get();
		}else {
			return new OrderEntity();
		}
		
	}
	@GetMapping("/retrieve/{name}")
	public OrderEntity retrieveCustomerOrderByName(@PathVariable final String name) {
		
		OrderEntity orderEntity=repository.findByName(name);
		return orderEntity;
	}
	
	@GetMapping("/all")
	public List<OrderEntity> retrieveAllCustomers() {
		
		return repository.findAll();
	}
	
	@PostMapping("/CreateOrder")
	public ResponseEntity addOrder(@RequestBody OrderEntity orderEntity) {
		
		repository.save(orderEntity);
		
		 
		 URI path=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(orderEntity.getId()).toUri();
		return ResponseEntity.created(path).build();
	}

}
