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
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto;
        
        System.out.println("Ingrese un texto");
        Scanner leer = new Scanner(System.in);
        texto = leer.next();
        
        String retorno = Simbolos(texto);
        
        System.out.println(retorno);
    }
    
    public static String Simbolos(String texto){
        
        int lon = texto.length();
        String aux = "";
        for (int i = 0; i < lon; i++){
        String letras = texto.substring(i, i+1);
        switch (letras){
            case ("A"):
                aux = aux + "@";
                break;
            
            case ("E"):
                aux = aux + "#";
                break;
            
            case ("I"):
                aux = aux + "$";
                break; 
               
            case ("O"):
                aux = aux + "%";
                break;
                
            case ("U"):
                aux = aux + "*";
                break;
                
            default:
                aux = aux + texto.substring(i,i+1);
                break;
        }
        }
        return aux;
    }
    }

