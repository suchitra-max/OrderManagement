package com.example.OrderItemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Order-Service" url="localhost:8181")
public interface ExchangeServiceProxy {

	@GetMapping("/retrieveOrderItems")
	  public OrderItemBean findAll() ;
}
