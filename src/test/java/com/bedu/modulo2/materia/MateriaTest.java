package com.bedu.modulo2.materia;

import com.bedu.modulo2.model.Materia;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MateriaTest {

    @Test
    public void createMateria(){
        Materia subject1 = new Materia();
        subject1.setNombre("English");
        Materia subject2 = new Materia();
        subject2.setNombre("Maths");
        assertThat(subject1.getNombre()).isEqualTo("English");
        assertThat(subject2.getNombre()).isEqualTo("Maths");
    }
}
