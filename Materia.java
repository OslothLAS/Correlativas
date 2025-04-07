package org.example;

import java.util.List;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Materia
{
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativa){};

    public void tieneCorrelativa(Materia materia){
        this.correlativas.contains(materia);
    }


}
