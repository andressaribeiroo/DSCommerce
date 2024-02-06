package com.projectEcommerce.DSCommerce.services;

import com.projectEcommerce.DSCommerce.dto.ProductDTO;
import com.projectEcommerce.DSCommerce.entities.Product;
import com.projectEcommerce.DSCommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);

    }
}