package com.sofka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String nombre;
    public static String menu;
    public static int option;

    public static void main(String[] args) {
        menu = "Bienvenido a la La Droguería Mi Salud\n" +
                "ingrese la opción que desea ejecutar\n"+
                "1.comprar producto\n" +
                "2.consultar precio y características\n" +
                "3.devolver producto\n";
        List<String> producto = new ArrayList<String>();
        producto.add("1.Aspirina    - Casi para todo             - $1.200");
        producto.add("2.Omeprazol   - Para la acidez de estómago - $  700");
        producto.add("3.Ramipril    - Para la hipertensión       - $1.500");
        producto.add("4.Paracetamol - Para aliviar el dolor      - $1.000");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();

        System.out.println(menu);
        option = entrada.nextInt();
        switch(option){
            case 1:{
                for(int i = 0; i < 4; i++ ){
                    System.out.println(producto.get(i));
                }
                System.out.println("Que medicamento desea\nIngresa el numero correspondiente");
                option = 0;
                option = entrada.nextInt();
                System.out.println(nombre+" compraste "+producto.get(option-1));
                break;
            }
            case 2:{
                System.out.println("estas son los medicamentos disponibles");
                for(int x = 0; x <4; x++ ){
                    System.out.println(producto.get(x));
                }
                break;
            }
            case 3:{
                System.out.println("ingresa el numero del medicamento que deseas devolver\n"+producto);
                option = 0;
                option = entrada.nextInt();
                System.out.println(nombre+" entregaste "+producto.get(option-1));
            }
        }

    }
}
/*
 La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación
 para poder facturar los productos que vende a sus clientes y para ello, los productos tienen
 unas características que deben indicársele al cliente para que pueda escoger el producto a comprar.
 Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y
  devoluciones en caso de que se presenten
 */