package com.alkemyjava2.mongodb.mapper;

import com.alkemyjava2.mongodb.dto.ProductoDto;
import com.alkemyjava2.mongodb.model.Color;
import com.alkemyjava2.mongodb.model.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel ="spring")
public interface IProductoMapper {
    IProductoMapper INSTANCE = Mappers.getMapper(IProductoMapper.class);

    ProductoDto toDto(Producto producto);


    Producto toEntity(ProductoDto productoDto);
    default Set<Color> mapColores(List<String> colores) {
        return colores.stream()
                .map(Color::fromString)
                .collect(Collectors.toSet());
    }
}
