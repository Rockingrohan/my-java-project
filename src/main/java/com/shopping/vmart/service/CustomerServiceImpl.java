package com.shopping.vmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.vmart.entities.Customer;
import com.shopping.vmart.repositories.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository custRepo;
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return custRepo.save(customer);
	}

}
