package com.project.buyanything.repository;

import com.project.buyanything.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//Products interface repository

public interface ProductsRepository extends JpaRepository<Products, Integer> {
Products findByName(String name);


}
