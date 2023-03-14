package com.example;

public class Switch {
    public static void main(String[] args) {

        String dia = "Lunes";

        switch (dia){
            case "Lunes":
                System.out.println("Hoy es Lunes! Animo!");
            case "Martes":
                System.out.println("Hoy es Martes! Animo!");
            case "Miercoles":
                System.out.println("Hoy es Miercoles! Animo!");
            case "Jueves":
                System.out.println("Hoy es Jueves! Animo!");
            case "Viernes":
                System.out.println("Hoy es Viernes! Animo!");
            case "Sabado":
                System.out.println("Hoy es Sabado! Animo!");
            case "Domingo":
                System.out.println("Hoy es Domingo! Animo!");
            default:
                System.out.println("no es un dia valido");

        }
        System.out.println();

    }
}
