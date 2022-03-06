package com.sofka;

import java.util.Scanner;

public class Main {

    public static String nombre ;
    public static String apellido;
    public static int edad;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad en años");
        edad = entrada.nextInt();

        if (edad<18){
            System.out.println(nombre+" "+apellido+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
        else if(edad>=18){
            System.out.println(nombre+" "+apellido+" usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }
    }
}
