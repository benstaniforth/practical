package com.ben.practical.controllers;

import com.ben.practical.models.database.Products;
import com.ben.practical.models.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @RequestMapping("/basket")
    public List<Products> showAllItemsInBasket () {
        return basketService.showAllItemsInBasket();
    }





}
