package com.example.demo3.Services;

import com.example.demo3.entities.Product;
import com.example.demo3.repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class productservice {
    @Autowired
    private Productrepo repository;
    public Product saveProducts(Product product)
    {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products)
    {
        return repository.saveAll(products);
    }

    public List<Product> getProduct()
    {
        return repository.findAll();
    }

    public Product getProductbyID(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Product getProductbyName(String name)
    {
        return repository.findByName(name);
    }

    public String deletebyid(int id)
    {
        repository.deleteById(id);
        return "Product Removed" +id;
    }

    public Product updateProduct(Product product)
    {
        Product existingproduct = repository.findById(product.getId()).orElse(null);
        existingproduct.setName(product.getName());
        existingproduct.setQty(product.getQty());
        existingproduct.setPrice(product.getPrice());
        return repository.save(existingproduct);
    }


}
