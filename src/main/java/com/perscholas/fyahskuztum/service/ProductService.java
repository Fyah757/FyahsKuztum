package com.perscholas.fyahskuztum.service;

import com.perscholas.fyahskuztum.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
}
