package com.shopping.vmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.vmart.entities.Product;
import com.shopping.vmart.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    // Get expensive games without needing any request body
    @GetMapping("/Games")
    public List<Product> getExpensiveGames() {
        return service.getExpensiveGames(); // No parameters required
    }
}
