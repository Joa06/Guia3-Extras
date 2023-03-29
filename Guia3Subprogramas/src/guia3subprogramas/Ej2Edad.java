/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3subprogramas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej2Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.*/
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        String respuesta = "";
        int edad = 0;
        MayMen(nombre, respuesta, edad, leer);
    }
    public static void MayMen(String nombre,String respuesta,int edad, Scanner leer){
        do{
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            System.out.println("Ingrese edad");    
            edad = leer.nextInt();
            if (edad >= 18){
                System.out.println(nombre + ", de " + edad + " años, es mayor de edad");
            } else
                System.out.println(nombre + ", de " + edad + " años, es menor de edad");
            if (!(respuesta.equalsIgnoreCase("NO")))
                System.out.println("Desea seguir mostrando personas?");
            respuesta = leer.next();
        } while (!(respuesta.equalsIgnoreCase("NO")));
    }
}
