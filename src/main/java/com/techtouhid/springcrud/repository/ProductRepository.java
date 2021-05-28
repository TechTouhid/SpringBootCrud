package com.techtouhid.springcrud.repository;

import com.techtouhid.springcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findByName(String name);

    List<Product> findAllByName(String name);
}


