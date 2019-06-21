package com.ben.practical.models.service;

import com.ben.practical.models.database.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService extends DatabaseService {

    public List<Products> getAllProducts() {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE quantity > 0")
                        .mapToBean(Products.class)
                        .list()
        );
    }

    public Products getSingleProduct(String name) {
        return jdbi.withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE name = :name")
                        .bind("name", name)
                        .mapToBean(Products.class)
                        .first()
        );
    }

    public void addProductToInProcessBasket(Products products) {
        jdbi.useHandle(handle ->
                handle.createUpdate("INSERT INTO IN_PROCESS (name, price, quantity, term_length, payment_interval) VALUES " +
                        "(:name, :price, :quantity, :termLength, :paymentInterval)")
                        .bind("name", products.getName())
                        .bind("price", products.getPrice())
                        .bind("quantity", products.getQuantity())
                        .bind("termLength", products.getTermLength())
                        .bind("paymentInterval", products.getPaymentInterval())
                        .execute()
        );
    }

    public void addProductToInCheckoutBasket(Products products) {
        jdbi.useHandle(handle ->
                handle.createUpdate("INSERT INTO IN_CHECKOUT (name, price, quantity, term_length, payment_interval, total) VALUES " +
                        "(:name, :price, :quantity, :termLength, :paymentInterval, :total)")
                        .bind("name", products.getName())
                        .bind("price", products.getPrice())
                        .bind("quantity", products.getQuantity())
                        .bind("termLength", products.getTermLength())
                        .bind("paymentInterval", products.getPaymentInterval())
                        .bind("total", products.getTotal())
                        .execute()
        );
    }

}
