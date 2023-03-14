package com.example;

public class For {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Juanito"};

        for(String nombre :nombres){
            System.out.println(nombre);
        }
        int[] numeros = {5,10,12};
        int suma = 0;

        for(int numero : numeros){
            suma += numero;

        }
        System.out.println(suma);


    }
}
