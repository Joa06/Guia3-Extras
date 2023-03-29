/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia3ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para buscar");
        int num = leer.nextInt();
        int[] vectorL = llenarVector();
        Validacion(vectorL, num);
    }
    
    public static int[] llenarVector(){
        int[] vector = new int[25];
        for (int i = 0; i < 25; i++){
            vector[i] = (int)(Math.random()*(25-1+1)+1);
        }
        return vector;
}
    
    public static void Validacion(int[] vectorL, int num){
         for (int j = 0; j < 25; j++){
            if (num == vectorL[j]){
                System.out.println("El numero " + num + " se encuentra en la posicion " + j);
            }
        }
    }
    
}

