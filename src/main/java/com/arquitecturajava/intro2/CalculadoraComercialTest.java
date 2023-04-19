package com.arquitecturajava.intro2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraComercialTest {

    CalculadoraComercial calculadora;
    @BeforeEach
    public void init() {
        calculadora = new CalculadoraComercial();
    }

    @Test
    public void calculadoraComisionPor0Test(){
        //act
        double comision = this.calculadora.comisionPorImporte(0);
        //asset
        assertEquals(0,comision, 0.1);
    }

    @Test
    public void calculadoraComisionMenor100Test(){
        //act
        double comision = this.calculadora.comisionPorImporte(90);
        //asset
        assertEquals(22.5,comision, 0.1);
    }

    @Test
    public void calculadoraComisionPor100Test(){

        //act
        double comision = calculadora.comisionPorImporte(100);
        //asset
        assertEquals(20,comision, 0.1);
    }
    @Test
    public void calculadoraComisionMenor500Test(){

        //act
        double comision = calculadora.comisionPorImporte(200);
        //asset
        assertEquals(40,comision, 0.1);
    }

    @Test
    public void calculadoraComisionPor500Test(){

        //act
        double comision = calculadora.comisionPorImporte(500);
        //asset
        assertEquals(50,comision, 0.1);
    }
    @Test
    public void calculadoraComisionMenor2000Test(){

        //act
        double comision = calculadora.comisionPorImporte(1000);
        //asset
        assertEquals(100,comision, 0.1);
    }

    @Test
    public void calculadoraComisionPor2000Test(){

        //act
        double comision = calculadora.comisionPorImporte(2000);
        //asset
        assertEquals(100,comision, 0.1);
    }
    @Test
    public void calculadoraComisionMayor2000Test(){

        //act
        double comision = calculadora.comisionPorImporte(3000);
        //asset
        assertEquals(150,comision, 0.1);
    }
}
