package com.techtouhid.springcrud.service;

import com.techtouhid.springcrud.entity.Product;
import com.techtouhid.springcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    // ----------------------------------------------Post Method--------------------------------------------------------
    // It can save one object into the database
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // It can save multiple object into the database
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    // ----------------------------------------------Get Method--------------------------------------------------------


}
