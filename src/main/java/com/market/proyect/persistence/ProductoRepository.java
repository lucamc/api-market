package com.market.proyect.persistence;

import com.market.proyect.persistence.crud.ProductoCrudRepository;
import com.market.proyect.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Con respositori le indicamos que esta clase esta interactuando con la base de datos.
@Repository
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

    //Obtener Producto dado el id.
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //Guarar producto
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //Borrar un Producto
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }

}