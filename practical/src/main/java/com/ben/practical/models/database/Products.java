package com.ben.practical.models.database;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

// @Data tag adds constructor, getters, setters, equals and hashCode methods.

@Data
public class Products {

    private String name;
    private BigDecimal price;
    private int quantity;
    private int termLength;
    private String paymentInterval;
    private BigDecimal total;


}
