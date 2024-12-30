package com.shopping.vmart.service;

import java.util.List;

import com.shopping.vmart.entities.Product;

public interface ProductService {
    public Product addProduct(Product product);

    // Remove the unnecessary parameter and just return the list
    public List<Product> getExpensiveGames(); // Updated method name for clarity
}
