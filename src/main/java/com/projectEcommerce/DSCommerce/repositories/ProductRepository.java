package com.projectEcommerce.DSCommerce.repositories;

import com.projectEcommerce.DSCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}