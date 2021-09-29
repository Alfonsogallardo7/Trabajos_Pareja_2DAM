package com.salesianostriana.dam.DTO_Ejercicio_Clase.Dto;

import com.salesianostriana.dam.DTO_Ejercicio_Clase.model.Producto;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class ProductoDtoConverter {

    public Producto createProductoDtoToProducto(CreateProductoDto c){
        return new Producto(
                c.getNombre(),
                c.getDesc(),
                c.getPvp(),
                Collections.singletonList(c.getImagenes()),
                c.getCategoria());
    }


}
