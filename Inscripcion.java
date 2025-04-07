package org.example;

import org.example.Materia;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Inscripcion{

    public void inscribirAlumnoAMateria(ArrayList<Materia> materias, Alumno alumno){
        if(this.puedeInscribirse(materias,alumno))
        {
            alumno.setInscripciones(materias);
        };
    }

    public boolean aprobada(Materia materia, Alumno alumno ){
      return alumno.aprobadas.contains(materia);
    }

    public boolean tieneAprobadaCorrelativas(Materia materia, Alumno alumno){
        return alumno.aprobadas.containsAll(materia.correlativas);
    }

    public boolean puedeInscribirse(ArrayList<Materia> materias, Alumno alumno ){
        return materias.stream().allMatch(materia -> this.tieneAprobadaCorrelativas(materia, alumno));
    }


}
