package com.alkemyjava2.mongodb.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.alkemyjava2.mongodb.model.Color;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "productos")
public class Producto {
    @Id
    private String id;
    @NotBlank
    private String nombre;
    private double precio;
    private boolean enStock;
    private Set<Color> colores;
}
