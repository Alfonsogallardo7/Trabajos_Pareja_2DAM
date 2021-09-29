package com.salesianostriana.dam.DTO_Ejercicio_Clase.dto;

import com.salesianostriana.dam.DTO_Ejercicio_Clase.model.Curso;
import com.salesianostriana.dam.DTO_Ejercicio_Clase.model.Direccion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAlumnoDto {
    private String nombre;

    private String apellidos;

    private String email;

    private Curso curso;

    private Direccion direccion;
}
