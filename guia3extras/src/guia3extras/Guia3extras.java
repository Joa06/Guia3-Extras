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
public class Guia3extras {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in);
        
        int tam ;
        int acumulador;
        
        acumulador = 0;
        
        System.out.println("Ingrese tamaño de vector:");
        tam = leer.nextInt();
        
        int vVector[] = new int [tam];
        System.out.println("Ingrese los numeros:");      
        for (int i = 0; i < tam; i++) 
        {
           vVector[i] = leer.nextInt();
           acumulador += vVector[i];
        }
        
        System.out.println("El total es:" + acumulador);
   }
}