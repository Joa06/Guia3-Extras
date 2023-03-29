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
public class Ejemplo2Void {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        Validacion(num1, num2);
    }
    
    public static void Validacion(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
            }else
            System.out.println("El numero " + num1 + " no es multiplo de " + num2);
            }
           
}
    

