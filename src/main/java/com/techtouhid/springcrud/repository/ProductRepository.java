package com.techtouhid.springcrud.repository;

import com.techtouhid.springcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
