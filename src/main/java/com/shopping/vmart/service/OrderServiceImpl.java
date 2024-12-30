package com.shopping.vmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.vmart.entities.Order;
import com.shopping.vmart.repositories.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService{

	
	 @Autowired
	 private OrderRepository orderRepo;
	
	 @Override
	 public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		 return orderRepo.save(order);
	}

	
}
