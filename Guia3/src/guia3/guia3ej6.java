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
public class guia3ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaFila,sumaColumna;
        boolean magica = true;
        
        System.out.println("Ingrese los numeros de su matriz (entre 1 y 9)");
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                do{
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] > 9 || matriz[i][j] < 0)
                        System.out.println("Numero no valido,ingrese uno nuevo entre 1 y 9");
                }
                while (matriz[i][j] > 9 || matriz[i][j] < 0);
            }
        }
        //Mostramos la matriz para poder corroborar que todo este en orden
        System.out.println("Su matriz:");
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //Declaramos una variable con la cual se van a comparar todas las otras
        int total = matriz[0][0] + matriz[0][1] + matriz[0][2];
        
        //Recorremos la matriz sumando filas y columnas y comparamos con la variable total
        for (int i = 0 ; i < 3 ; i++){
            sumaFila = 0; sumaColumna = 0;
            for (int j = 0 ; j < 3 ; j++){
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != total || sumaColumna != total){
                magica = false;
            }
        }
        
        //Corroboramos las diagonales
        int diagonal = (matriz[0][0] + matriz[1][1] + matriz[2][2]);
        int diagonalInversa = (matriz[0][2] + matriz[1][1] + matriz[2][0]);
        if (diagonal != total || diagonalInversa != total){
            magica = false;
        }
        //Si se detecto alguna fila,columna o diagonal distinta,la bandera "magica" se volvera false
        //De otro modo se quedara en true
        if (magica)
            System.out.println("Su matriz es magica");
        else
            System.out.println("Su matriz no es magica");
    }
}

