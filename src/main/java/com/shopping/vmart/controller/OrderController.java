package com.shopping.vmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.vmart.entities.Order;
import com.shopping.vmart.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService service;
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order) {
		return service.addOrder(order);
	}
}
