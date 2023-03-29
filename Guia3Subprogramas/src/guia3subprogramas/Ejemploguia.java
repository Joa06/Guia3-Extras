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
public class Ejemploguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);
int num1 = 5;
int num2 = 7;
int retorno = sumar(num1, num2);
System.out.println("La suma de ambos es: " + retorno);
}
    
public static int sumar(int num1, int num2) {
int suma;
suma = num1 + num2;
return suma;
}
    }
    

