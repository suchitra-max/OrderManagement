package com.example.OrderItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {
	   @Autowired  ExchangeServiceProxy proxyService;

	@RequestMapping("/dashboard/feign/peers")
	   public  List<OrderItemBean> findAll(){
	        return proxyService.findAll();
	   }
	
}
