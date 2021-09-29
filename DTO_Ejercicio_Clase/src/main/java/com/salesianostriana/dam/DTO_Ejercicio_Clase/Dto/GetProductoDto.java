package com.salesianostriana.dam.DTO_Ejercicio_Clase.Dto;

import com.salesianostriana.dam.DTO_Ejercicio_Clase.model.Categoria;
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

    private String nombre;

    private double pvp;

    private List <String> imagenes;

    private Categoria Categoria;

}
