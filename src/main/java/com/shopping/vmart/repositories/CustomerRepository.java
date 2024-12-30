package com.shopping.vmart.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopping.vmart.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
