package com.salesianostriana.dam.DTO_Ejercicio_Clase.Dto;

import com.salesianostriana.dam.DTO_Ejercicio_Clase.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor

public class CreateProductoDto {

        private Long id;
        private String nombre;
        private double desc;
        private double pvp;
        private String imagenes;
        private Categoria categoria;

    }


