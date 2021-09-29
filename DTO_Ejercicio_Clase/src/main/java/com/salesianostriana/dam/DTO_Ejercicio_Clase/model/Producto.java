package com.salesianostriana.dam.DTO_Ejercicio_Clase.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double desc;

    private double pvp;

    private List<String> imagenes;

    @ManyToOne
    private Categoria categoria;

    public Producto(String nombre, double desc, double pvp, List<String> imagenes, Categoria categoria) {
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.imagenes = imagenes;
        this.categoria = categoria;
    }

    public Producto(String nombre, double desc, double pvp, List<String> imagenes) {
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.imagenes = imagenes;
    }
}
