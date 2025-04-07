package org.example;

import java.util.ArrayList;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Alumno {

    public String nombre;
    public ArrayList<Materia> aprobadas;
    public ArrayList<Materia> inscripciones;


    public void agregarMateriaAprobada(ArrayList<Materia> materias){
        this.aprobadas.addAll(materias);
    }




}
