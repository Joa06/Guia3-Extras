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
public class guia3ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = leer.nextInt();
                 }
         }
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                     System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
    }
        int [][] traspuesta = new int [3][3];
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                traspuesta[j][i] = matriz[j][i];
                System.out.print(traspuesta[j][i] + "  ");
            }
            System.out.println(" ");
}
        for (int i= 0; i < 3; i++){
            int cont = 0;
            for (int j = 0; j < 3; j++){
                if (traspuesta[j][i] + matriz[i][j] == 0) {
                    cont = cont + 1;
                }
                if (cont == 9){
                    System.out.println("La matriz es antisimetrica");
                }
            }
        }
}
}
