package com.alkemyjava2.mongodb.service;

import com.alkemyjava2.mongodb.dto.ProductoDto;
import com.alkemyjava2.mongodb.model.Producto;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.List;


public interface IProductoService {

    ProductoDto crearProducto(ProductoDto productoDto) throws JsonProcessingException;
    ProductoDto obtenerPorId(String id);
    List<ProductoDto> listarProductos();
    void eliminarProducto(String id);
    ProductoDto obtenerPorNombre(String nombre);

}
