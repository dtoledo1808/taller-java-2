package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String nombre;
    public static String menu;
    public static int option;

    public static void main(String[] args) {
        menu = "Bienvenido a la video tienda el porvenir\n" +
                "ingrese la opción que desea ejecutar\n"+
                "1.alquilar película\n" +
                "2.consultar películas disponibles\n" +
                "3.entregar película\n";
        List<String> films = new ArrayList<String>();
        films.add("1.the batman");
        films.add("2.uncharted: fuera del mapa");
        films.add("3.pil - princesa cero fresa");
        films.add("4.sing 2");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println(menu);
        option = entrada.nextInt();
        switch(option){
            case 1:{
                System.out.println(films);
                System.out.println("cual de estas deseas alquilar\nIngresa el numero correspondiente");
                option = 0;
                option = entrada.nextInt();
                System.out.println(nombre+" alquilaste "+films.get(option-1));
                break;
            }
            case 2:{
                System.out.println("estas son las películas disponibles");
                System.out.println(films);
                break;
            }
            case 3:{
                System.out.println("ingresa el numero de la película que deseas devolver\n"+films);
                option = 0;
                option = entrada.nextInt();
                System.out.println(nombre+" entregaste "+films.get(option-1));
            }
        }


    }
}
    /*
     * La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir,
     * requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios.
     * Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles
     * y recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan
     * a presentar daños u otra novedad sobre la película.
      */
