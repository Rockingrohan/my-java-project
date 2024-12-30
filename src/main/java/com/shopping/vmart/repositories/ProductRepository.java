package com.shopping.vmart.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopping.vmart.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    
    // Remove the unnecessary parameter from the method
    @Query("SELECT p FROM Product p WHERE p.category = 'Games' AND p.price > 100")
    List<Product> findExpensiveGames(); // Updated method name for clarity
}
