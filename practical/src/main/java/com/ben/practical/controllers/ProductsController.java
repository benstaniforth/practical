package com.ben.practical.controllers;

import com.ben.practical.models.database.Products;
import com.ben.practical.models.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping("/products")
    public List<Products> getAllProducts () {
        return productsService.getAllProducts();
    }

}
