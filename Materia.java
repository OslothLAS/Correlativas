package org.example;

import java.util.ArrayList;
import java.util.List;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter

public class Materia
{
    private String nombre;
    public ArrayList<Materia> correlativas;

    public Materia(String nombre, ArrayList<Materia> correlativa){};

}