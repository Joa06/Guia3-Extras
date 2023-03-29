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
public class guia3exej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner (System.in);
        
        int filas = 20;
        int columnas = 20;
        int contador = 0;
        int[] numeroAleatorio  = new int [5];
        String mMatriz [][] = new String [filas][columnas];
        String palabra;
        
        //Rellenar string
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                //Pase a string los numeros random (int)
               mMatriz[i][j]= Integer.toString((int)(Math.random()*10));
            }
        }
   
        
        //IMPRIMIR MATRIZ
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                System.out.print(mMatriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
    
        for (int i = 0; i < 5; i++) 
        {
            numeroAleatorio[i] = (int) (Math.random()*20);

        }
 
        
        System.out.println(" ");
        for (int i = 0; i < 5; i++) 
        {

            System.out.println(i+1+")"+numeroAleatorio[i]);
        }
       
        
        //----------------------------------------------------------
        

            
        do 
        {
            System.out.println("\nIngrese palabra entre 3 y 5 caracteres");
            palabra = leer.next();
            
            if(palabra.length()<3 || palabra.length()>5)
            {
                System.out.println("Error. Cantidad de caracteres invalido");
                continue;
            }
            
            //Recorro la matriz de numeros aleatorios
            for (int i = 0; i < filas; i++) 
            {
                for (int j = 0; j < columnas; j++) 
                {
                   if (i==numeroAleatorio[contador])
                   {
                        if (j<palabra.length())
                       {
                            mMatriz[i][j] = palabra.substring(j,j+1)  ;                   
                       }   
                   }

                }
            }
                   
            contador++;

        }while(contador<5);        
        
 
        
        //IMPRIMIR MATRIZ
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
                System.out.print(mMatriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
       
        
    }
    
    }
    

