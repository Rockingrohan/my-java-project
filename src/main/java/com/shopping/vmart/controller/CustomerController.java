package com.shopping.vmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.vmart.entities.Customer;
import com.shopping.vmart.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
}
