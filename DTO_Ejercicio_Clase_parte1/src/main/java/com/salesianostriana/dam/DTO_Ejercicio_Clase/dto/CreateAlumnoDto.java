package com.salesianostriana.dam.DTO_Ejercicio_Clase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAlumnoDto {

    private String nombre;

    private String apellido1;

    private String apellido2;

    private String email;

    private String curso;

    private String direccion;


}
