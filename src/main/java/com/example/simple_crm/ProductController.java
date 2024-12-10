package com.example.simple_crm;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class); // Logger instance
    private ArrayList<Product> products = new ArrayList<>();

    // CRUD routes

    // Create
    // @PostMapping("")
    // public ResponseEntity<Product> createProduct(@RequestBody Product product) {
    //   products.add(product);
    //   return new ResponseEntity<>(product, HttpStatus.CREATED);
    // }

    //---------------------------Assignment 3.10---------------------------------
    @PostMapping("")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        logger.info("POST /products called with product name: {}", product.getName());
        products.add(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    //---------------------------Assignment 3.10---------------------------------


    // Read - get all products
    @GetMapping("")
    public ResponseEntity<ArrayList<Product>> getAllProducts() {
        logger.info("GET /products called"); // Logging the request
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    // Read - get one product
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id) {

      try {
        int index = getProductIndex(id);
        logger.info("GET /products/{} called", id); // Logging the request
        return new ResponseEntity<>(products.get(index), HttpStatus.OK);
      } catch (ProductNotFoundException e) {
        logger.error("Product with ID {} not found", id); // Logging the error
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id, @RequestBody Product product) {

      try {
        int index = getProductIndex(id);
        Product updateProduct = products.get(index);
        updateProduct.setName(product.getName());
        updateProduct.setDescription(product.getDescription());
        updateProduct.setPrice(product.getPrice());
        products.set(index, updateProduct);
        return new ResponseEntity<>(updateProduct, HttpStatus.OK);
      } catch (ProductNotFoundException e) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String id) {

      try {
        int index = getProductIndex(id);
        products.remove(index);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       } catch (ProductNotFoundException e) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }

    // Helper
    private int getProductIndex(String id) {
      for (Product product : products) {
        if (product.getId().equals(id)) {
          return products.indexOf(product);
        }
      }

      // return -1;
      throw new ProductNotFoundException(id);
    }
}
