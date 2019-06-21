package com.ben.practical.controllers;

import com.ben.practical.models.database.Products;
import com.ben.practical.models.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping("/products")
    public List<Products> getAllProducts () {
        return productsService.getAllProducts();
    }

    @RequestMapping("/products/{name}")
    public Products getProduct(@PathVariable String name) {
        return productsService.getSingleProduct(name);
    }


    // TODO - fix addToBasket method below!!

    @RequestMapping(method = RequestMethod.POST, value="/products/{name}/addtobasket")
    public void addToBasket (@RequestBody Products product) {
        productsService.addProductToInProcessBasket(product);
    }




}
