package com.market.proyect.domain;

import lombok.Getter;
import lombok.Setter;

public class Category {

    @Getter @Setter
    private int categotyId;
    @Getter @Setter
    private String category;
    @Getter @Setter
    private Boolean active;
}
