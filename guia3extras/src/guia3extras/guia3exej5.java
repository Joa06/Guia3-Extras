/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia3exej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);       
        int filas;
        int columnas;
        int acumulador = 0;

        System.out.println("Ingrese dimension de matriz");
        filas = leer.nextInt();
        columnas = leer.nextInt();

        int mMatriz [][] = new int [filas][columnas];
        
        
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
               mMatriz[i][j] = (int)(Math.random()*10+1);
               acumulador+= mMatriz[i][j];
            }
        }
        
        
                for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                System.out.print(mMatriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Suma total:" + acumulador);
              
    }
    }
    

