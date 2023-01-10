package com.market.proyect.persistence;

import com.market.proyect.persistence.crud.ProductoCrudRepository;
import com.market.proyect.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCateogria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCateogria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

}
