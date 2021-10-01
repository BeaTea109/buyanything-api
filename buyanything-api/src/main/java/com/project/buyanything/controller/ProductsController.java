package com.project.buyanything.controller;

import com.project.buyanything.service.ProductService;
import com.project.buyanything.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductsController {
    @Autowired private ProductService service;

//This get method is the API to retrieve all products from the DB
    @GetMapping("/products")
    public List<Products> findAllProducts(){
        return service.getProducts();
    }
}
