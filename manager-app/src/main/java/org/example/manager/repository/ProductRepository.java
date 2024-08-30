package org.example.manager.repository;

import org.example.manager.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> findAll();

    Product save(Product product);

    Optional<Product> findById(Integer id);

    void deleteById(Integer id);
}
