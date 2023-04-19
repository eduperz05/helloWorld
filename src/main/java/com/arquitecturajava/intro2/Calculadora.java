package com.arquitecturajava.intro2;

public class Calculadora {

    public double sumar(double a, double b) {
        return a+b;
    }

    public double restar(double a, double b) {
        return a-b;
    }

    public double mayor( double[] lista ) {
        double mayor=Integer.MIN_VALUE;
        for (double v : lista) {
            if (mayor < v) {
                mayor = v;
            }
        }
        return mayor;
    }
}
