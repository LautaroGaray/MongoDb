package com.alkemyjava2.mongodb.dto;
import com.alkemyjava2.mongodb.model.Color;
import lombok.Data;
import java.util.Set;

@Data
public class ProductoDto {
    private String id;
    private String nombre;
    private double precio;
    private boolean enStock;
    private Set<Color> colores;
}
