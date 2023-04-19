package com.arquitecturajava.intro2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void  sumarTest(){
        Calculadora calculadora = new Calculadora();
        double resultadoCalculadora = calculadora.sumar(2,2);

        //asserts

        assertEquals(4, resultadoCalculadora, 0.1);
    }
    @Test
    public void  restarTest(){
        Calculadora calculadora = new Calculadora();
        double resultadoCalculadora = calculadora.restar(3,2);

        //assserts

        assertEquals(1, resultadoCalculadora, 0.1);
    }

    @Test
    public void numeroMayor() {
        double[] listaNumeros = {3,6,2,6,2,1,7};
        Calculadora calculadora = new Calculadora();
        double resultadoCalculadora = calculadora.mayor(listaNumeros);

        assertEquals(7, resultadoCalculadora, 0);
    }

    @Test
    public void numeroMenor() {
        double[] listaNumeros = {3,6,2,6,2,1,7};
        Calculadora calculadora = new Calculadora();
        double resultadoCalculadora = calculadora.menor(listaNumeros);

        assertEquals(1, resultadoCalculadora, 0);
    }
}
