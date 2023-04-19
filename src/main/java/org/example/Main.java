package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] sums = {1,2,3,4,5,6,7,8,9,10};
        sumatorio suma = new sumatorio(sums);
        System.out.println("suma.getResultant() = " + suma.getResultant());
        System.out.println("suma.greaterNum() = " + suma.greaterNum());
    }
}