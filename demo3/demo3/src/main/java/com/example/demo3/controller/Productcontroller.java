package com.example.demo3.controller;

import com.example.demo3.Services.productservice;
import com.example.demo3.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Productcontroller {
    @Autowired
    private productservice service;

    @PostMapping(path="/addProduct")
    public Product addProduct(@RequestBody  Product product)
    {
        return service.saveProducts(product);

    }
    @PostMapping(path="/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> product)
    {
        return service.saveProducts(product);
    }

    @GetMapping(path="/products")
    public List<Product> findallproducts()
    {
        return service.getProduct();
    }
    @GetMapping(path="/products/{id}")

    public Product findallproductsbyId(int id)
    {
        return service.getProductbyID(id);
    }
    @GetMapping(path="/products/{name}")
    public Product findallproductsbyname(String name)
    {
        return service.getProductbyName(name);
    }

    @PutMapping(path="/update")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }
    @DeleteMapping(path="/delete/{id}")
    public String deleteProductbyId(@PathVariable int id)
    {
        return service.deletebyid(id);
    }


}
