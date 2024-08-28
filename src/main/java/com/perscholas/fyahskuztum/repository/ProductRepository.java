package com.perscholas.fyahskuztum.repository;

import com.perscholas.fyahskuztum.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
