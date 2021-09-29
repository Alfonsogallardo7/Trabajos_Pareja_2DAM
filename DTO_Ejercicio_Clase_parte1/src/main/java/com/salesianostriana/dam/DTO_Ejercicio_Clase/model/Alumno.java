package com.salesianostriana.dam.DTO_Ejercicio_Clase.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private Long Id;

    private String Nombre;

    private String Apellido1;

    private String Apellido2;

    private String Telefono;

    private String Email;

    @ManyToOne
    private Direccion Direccion;

    @ManyToOne
    private Curso Curso;


    public Alumno(String nombre, String apellido1, String apellido2, String telefono, String email, Direccion direccion, Curso curso) {
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
        this.Telefono = telefono;
        Email = email;
        Direccion = direccion;
        Curso = curso;
    }

    public Alumno(String nombre, String apellido1, String apellido2, String curso, String direccion, String email) {

    }
}
