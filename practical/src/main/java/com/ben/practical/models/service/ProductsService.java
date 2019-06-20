package com.ben.practical.models.service;

import com.ben.practical.models.database.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService extends DatabaseService {

    public List<Products> getAllProducts() {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM products")
                        .mapToBean(Products.class)
                        .list()
        );
    }

}
