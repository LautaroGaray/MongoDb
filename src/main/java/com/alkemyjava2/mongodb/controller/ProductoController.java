package com.alkemyjava2.mongodb.controller;

import com.alkemyjava2.mongodb.dto.ProductoDto;
import com.alkemyjava2.mongodb.service.IProductoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    @Autowired
    private IProductoService productoService;


    @GetMapping
    public ResponseEntity<List<ProductoDto>> listarTodos(){
         List<ProductoDto> lista = productoService.listarProductos();
         return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<ProductoDto> crearProducto(@RequestBody ProductoDto productoDto) throws JsonProcessingException {
        System.out.println("POST - Producto DTO...");
        System.out.println(productoDto.toString());
        try{
            ProductoDto creado = productoService.crearProducto(productoDto);
            return ResponseEntity.ok(creado);
        }catch (Exception e){
            System.out.println(e.getMessage());
            ProductoDto empty = new ProductoDto();
            return ResponseEntity.ok(empty);
        }

    }

}
