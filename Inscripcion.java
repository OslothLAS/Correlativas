package org.example;
import java.util.Arrays;
import java.util.List;

public class Inscripcion {


    public Boolean aprobada(Alumno alumno, List<Materia> materias) {
        return materias.stream().allMatch(materia -> alumno.puedeInscribirse(materia));
    }
}
