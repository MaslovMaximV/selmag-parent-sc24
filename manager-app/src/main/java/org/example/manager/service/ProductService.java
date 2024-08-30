package org.example.manager.service;

import org.example.manager.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAllProducts();

    Product createProject(String title, String details);
}
