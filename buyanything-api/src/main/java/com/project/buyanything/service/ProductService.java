package com.project.buyanything.service;


import com.project.buyanything.entity.Products;
import com.project.buyanything.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Declaring list to get the products object to return all products
@Service
public class ProductService {
    @Autowired private ProductsRepository repo;

    public List<Products> getProducts() {
        return repo.findAll();
    }
}
