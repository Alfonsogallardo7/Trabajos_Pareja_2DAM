package com.salesianostriana.dam.DTO_Ejercicio_Clase;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue
    private Long Id;

    private String Nombre;

    private String Tipo;

    private String Tutor;

    private int Aula;


}
