package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InscripcionTest {
    @Test



    public void testInscripcionAprobada() {

        List<Materia> correlativaads = new ArrayList<Materia>();
        Materia ads = new Materia("ads", correlativaads);

        List<Materia> correlativadds = new ArrayList<Materia>();
        correlativadds.add(ads);
        Materia dds = new Materia("dds", correlativadds);

        List<Materia> correlativasmat = new ArrayList<Materia>();
        correlativasmat.add(ads);
        correlativasmat.add(dds);
        Materia mat = new Materia("dds", correlativasmat);


        List<Materia> aprobadasOsmar = new ArrayList<Materia>();
        aprobadasOsmar.add(dds);
        aprobadasOsmar.add(ads);

        List<Materia> inscripcionOsmar = new ArrayList<Materia>();
        inscripcionOsmar.add(mat);

        Alumno osmar = new Alumno("Osmar", aprobadasOsmar);

        Inscripcion inscripcion = new Inscripcion();

        Assertions.assertEquals(true, inscripcion.aprobada(osmar, inscripcionOsmar));


    }
}