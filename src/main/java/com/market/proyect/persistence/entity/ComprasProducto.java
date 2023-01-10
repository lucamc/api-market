package com.market.proyect.persistence.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;
    @Getter @Setter
    private Integer cantidad;
    @Getter @Setter
    private Double total;
    @Getter @Setter
    private Boolean estado;

    @ManyToOne
    @Getter @Setter @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @Getter @Setter @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

}

