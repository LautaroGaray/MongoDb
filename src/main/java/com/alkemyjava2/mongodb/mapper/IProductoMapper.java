package com.alkemyjava2.mongodb.mapper;

import com.alkemyjava2.mongodb.dto.ProductoDto;
import com.alkemyjava2.mongodb.model.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface IProductoMapper {

    ProductoDto toDto(Producto producto);
    Producto toEntity(ProductoDto productoDto);
}
