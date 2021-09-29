package com.salesianostriana.dam.DTO_Ejercicio_Clase.dto;

import com.salesianostriana.dam.DTO_Ejercicio_Clase.model.Alumno;
import org.springframework.stereotype.Component;

@Component
public class AlumnoDtoCoverter {

    public Alumno createAlumnoDtoToAlumno (CreateAlumnoDto c) {
        return new Alumno(
                c. getNombre(),
                c.getApellido1(),
                c.getApellido2(),
                c.getCurso(),
                c.getDireccion(),
                c.getEmail()
        );
    }

    public GetAlumnoDto alumnoToGetAlumnoDto (Alumno a) {

        GetAlumnoDto result = new GetAlumnoDto();
        result.setNombre(a.getNombre());
        result.setApellidos(String.format("%s (%s)",a.getApellido1(), a.getApellido2()));
        result.setCurso(a.getCurso());
        result.setDireccion(a.getDireccion());
        result.setEmail(a.getEmail());
        return result;

    }
}
