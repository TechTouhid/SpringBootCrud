package com.techtouhid.springcrud.controller;

import com.techtouhid.springcrud.entity.Product;
import com.techtouhid.springcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    // ----------------------------------------------Post Method--------------------------------------------------------
    // Add one object
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
    // Add all objects
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    // ----------------------------------------------Get Method---------------------------------------------------------
    // find all objects
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    // find object by id
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    // find object by name
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    // find all objects by name
    @GetMapping("/productsByName/{name}")
    public List<Product> findAllProductsByName(@PathVariable String name) {
        return service.getProductByNames(name);
    }

    // ----------------------------------------------Delete & update Method---------------------------------------------

    // update object by id
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }
    // it can delete object by id
    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
