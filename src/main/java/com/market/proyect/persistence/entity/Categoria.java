package com.market.proyect.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter @Column(name = "id_categoria")
    private Integer idCategoria;

    @Getter @Setter
    private String descripcion;

    @Getter @Setter
    private Boolean estado;


    @OneToMany(mappedBy = "categoria")
    @Getter @Setter
    private List<Producto> productos;


}
