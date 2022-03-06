package com.sofka;

import java.util.Scanner;

public class Main {

    public static int edad;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        if(edad<18){
            System.out.println("Usted aún es un niño(a).");
        }
    }
}
