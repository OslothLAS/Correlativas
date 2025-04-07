package org.example;

import java.util.ArrayList;
import java.util.List;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Alumno {

    private String nombre;
    private List<Materia> aprobadas;
    private List<Materia> inscripciones;


    public void agregarMateriaAprobada(List<Materia> materias){
        this.aprobadas.addAll(materias);
    }

    public void inscribirseAUnaMateria(Materia materia){
        this.inscripciones.add(materia);
    }

    public void insribirseAMasDeUnaMateria( List<Materia> materias){
        this.inscripciones.addAll(materias);
    }


}
