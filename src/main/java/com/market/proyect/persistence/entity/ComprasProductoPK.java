package com.market.proyect.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Getter @Setter
    @Column(name = "id_compra")
    private Integer idCompra;

    @Getter @Setter
    @Column(name = "id_producto")
    private Integer idProducto;
}
