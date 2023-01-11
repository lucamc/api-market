package com.market.proyect.domain;

import lombok.Getter;
import lombok.Setter;

public class Product {

    @Getter @Setter
    private int productId;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int categoryId;
    @Getter @Setter
    private double price;
    @Getter @Setter
    private int stock;
    @Getter @Setter
    private Boolean active;
    @Getter @Setter
    private Category category;
}
