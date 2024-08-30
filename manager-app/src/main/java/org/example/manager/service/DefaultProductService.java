package org.example.manager.service;

import lombok.RequiredArgsConstructor;
import org.example.manager.entity.Product;
import org.example.manager.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultProductService implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product createProject(String title, String details) {
        return this.productRepository.save(new Product(null, title, details));

    }
}
