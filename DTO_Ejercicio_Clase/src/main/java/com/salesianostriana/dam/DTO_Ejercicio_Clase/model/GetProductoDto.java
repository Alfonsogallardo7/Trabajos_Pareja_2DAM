package com.salesianostriana.dam.DTO_Ejercicio_Clase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProductoDto {
    private Long id;

    private String nombre;

    private double desc;

    private double pvp;

    private List<String> imagenes;

    private Categoria categoria;

}
