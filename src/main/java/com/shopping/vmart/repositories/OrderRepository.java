package com.shopping.vmart.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shopping.vmart.entities.Order;

public interface OrderRepository  extends CrudRepository<Order,Integer>{

}
