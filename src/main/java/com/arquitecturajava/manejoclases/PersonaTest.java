package com.arquitecturajava.manejoclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {

    @Test
    public void estaJubiladoTest() {
        Persona p1 = new Persona("pedro", "gomez suarez", 70);

        boolean jubilado = p1.estaJubilado();
        assertTrue(jubilado);
    }
}
