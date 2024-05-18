package com.example.demo3.repository;

import com.example.demo3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<Product,Integer> {


    Product findByName(String name);
}
