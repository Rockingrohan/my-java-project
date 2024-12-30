package com.shopping.vmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.vmart.entities.Product;
import com.shopping.vmart.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getExpensiveGames() {
        // No parameter required, just call the repository method
        return productRepo.findExpensiveGames();
    }
}
