package com.salesianostriana.dam.DTO_Ejercicio_Clase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    @Id
    @GeneratedValue
    private long id;
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }
}
