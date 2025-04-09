package org.example;

import org.example.Materia;
import java.util.ArrayList;
import java.util.List;

public class Alumno {


    private String nombre;
    private List<Materia> aprobadas;

    public Boolean puedeInscribirse(Materia materia) {
        return this.aprobadas.containsAll(materia.getCorrelativas());
    }

    public Alumno(String nombre, List<Materia> aprobadas){}




    //SETTERS Y GETTERS
    public List<Materia> getAprobadas() {
        return aprobadas;
    }

    public void setAprobadas(List<Materia> aprobadas) {
        this.aprobadas = aprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
