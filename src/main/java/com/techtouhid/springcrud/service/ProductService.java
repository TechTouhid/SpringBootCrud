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

    // It can find all the product in the database
    public List<Product> getProducts() {
        return repository.findAll();
    }

    // It can find object by id if not it will return null
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    // It can find object by name
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    // It can find all object by name
    public List<Product> getProductByNames(String name) {
        return repository.findAllByName(name);
    }

    // ----------------------------------------------Delete & update Method---------------------------------------------

    // It can delete any object by id
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product Removed !!" + id;
    }

    // It can update any object by id
    public Product updateProduct(Product product) {
        // First find the product which is present in database
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}
