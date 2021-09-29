package com.salesianostriana.dam.DTO_Ejercicio_Clase.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Direccion {

    @Id
    @GeneratedValue
    private Long Id;

    private String Tipodevia;

    private String Linea1;

    private String Linea2;

    private int Codigopostal;

    private String Poblacion;

    private String Provincia;

    public Direccion(String tipodevia, String linea1, String linea2, int codigopostal, String poblacion, String provincia) {
        Tipodevia = tipodevia;
        Linea1 = linea1;
        Linea2 = linea2;
        Codigopostal = codigopostal;
        Poblacion = poblacion;
        Provincia = provincia;
    }
}
