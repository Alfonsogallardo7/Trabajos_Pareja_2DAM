package com.salesianostriana.dam.DTO_Ejercicio_Clase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateProductoDto {

    private Long id;
    private String nombre;
    private double desc;
    private double pvp;
    private List<String> imagenes;
}
