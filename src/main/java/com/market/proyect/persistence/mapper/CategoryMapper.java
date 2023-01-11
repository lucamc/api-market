package com.market.proyect.persistence.mapper;

import com.market.proyect.domain.Category;
import com.market.proyect.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    //Comvierto una categoría en category
    @Mappings({
            @Mapping(source = "idCategoria", target = "categotyId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    //Mapeo inverso
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true) //Ignoro productos que tambien se encuentra en Categorias
    Categoria toCategoria(Category category);
}
