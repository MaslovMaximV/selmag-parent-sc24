package org.example.manager.repository;

import org.example.manager.entity.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    Product save(Product product);
}
