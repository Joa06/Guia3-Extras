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
public class guia3ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Recorrer un vector de N enteros contabilizando cuántos números son de
          1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        int[] vectorL = llenarVector();
        contador(vectorL);
    }
    
   
    public static int[] llenarVector(){
          int[] vector = new int [25];
        for (int i = 0; i < 25; i++){
            vector[i] = (int)(Math.random() * (10000 - 1 + 1) + 1);  
        System.out.println(vector[i]);
        }
        return vector;
    }
    
    public static void contador(int[] vectorL){
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        for (int i = 0; i < 25; i++){
        if (vectorL[i] < 10){
            cont1 = cont1 + 1;
        }else if(vectorL[i] > 10 && vectorL[i] < 100) {
            cont2 = cont2 + 1;   
        }else if(vectorL[i] > 100 && vectorL[i] < 1000){
            cont3 = cont3 + 1;
        }else if(vectorL[i] > 100 && vectorL[i] < 10000) {
            cont4 = cont4 + 1;
        }else if(vectorL[i] > 1000 && vectorL[i] < 100000){
            cont5 = cont5 + 1;
                    }
}        
        System.out.println("Hay " + cont1 + " numeros de 1 cifra.");
        System.out.println("Hay " + cont2 + " numeros de 2 cifras.");
        System.out.println("Hay " + cont3 + " numeros de 3 cifras.");
        System.out.println("Hay " + cont4 + " numeros de 4 cifras.");
        System.out.println("Hay " + cont5 + " numeros de 5 cifras."); 
}
}
