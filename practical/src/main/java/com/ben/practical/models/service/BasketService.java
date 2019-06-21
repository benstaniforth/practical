package com.ben.practical.models.service;

import com.ben.practical.models.database.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService extends DatabaseService {

    public List<Products> showAllItemsInBasket () {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM IN_PROCESS")
                        .mapToBean(Products.class)
                        .list()
        );
    }




}
