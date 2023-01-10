package com.market.proyect.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @Table(name = "clientes")
public class Cliente {


    @Id
    @Getter @Setter
    private String id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter @Column(name = "apellidos")
    private String apellido;

    @Getter @Setter
    private Integer celular;

    @Getter @Setter
    private String direccion;

    @Getter @Setter @Column(name = "correo_electronico")
    private String correoElectronico;


    @OneToMany(mappedBy = "cliente")
    @Getter @Setter
    private List<Compra> compras;

}
