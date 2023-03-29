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
public class guia3exej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner (System.in);
        
        int tam;
        boolean distintos;
        distintos = false;
      
        System.out.println("Ingrese tamaño de vector:");
        tam = leer.nextInt();
        
        System.out.println("Ingrese numeros del primer vector:");
        int vVector1[] = new int [tam];
        int vVector2[] = new int [tam];
        
        for (int i = 0; i < tam; i++) 
        {
           vVector1[i] = leer.nextInt();        
        }
        System.out.println("Ingrese numeros del segundo vector:");       
        
        for (int i = 0; i < tam; i++) 
        {
           vVector2[i] = leer.nextInt();        
        }

        for (int i = 0; i < tam; i++) 
        {
           if (vVector1[i]!=vVector2[i])
           {
              distintos = true;
              break; 
           }
        }
        
        if (distintos == true)
        {
            System.out.println("Los vectores tienen valores distintos");
        }
        else
        {
            System.out.println("Los vectores son iguales");
        }
        
    }
    }
    

