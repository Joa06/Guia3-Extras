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
public class Ej1Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para operar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opc = leer.nextInt();
        switch (opc){
            case 1:
                int retornoS = suma(num1, num2);
                System.out.println(retornoS);
                break;
            
            case 2:
                int retornoR = resta(num1, num2);
                System.out.println(retornoR);
                break;
                
            case 3:
                int retornoM = multiplicacion(num1, num2);
                System.out.println(retornoM);
                break;
             
            case 4: 
                int retornoD = division(num1, num2);
                System.out.println(retornoD);
                break;
        }
    }
    
    public static int suma(int num1, int num2){
        int sumar = num1 + num2;
        return sumar; 
    }
    
    public static int resta(int num1, int num2){
        int restar = num1 - num2;
        return restar;
    }
    
    public static int multiplicacion(int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }
    
    public static int division(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
}
