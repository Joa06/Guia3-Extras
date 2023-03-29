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
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante. */
        
    Scanner leer = new Scanner(System.in);
    String[] Equipo = new String[8];
    for (int i = 0; i < 8; i++){
        System.out.println("Ingrese nombre");
        Equipo[i] = leer.next();
    }
    
    for (int j = 0; j < 8; j++){
            System.out.println(Equipo[j]);
        }
    }   
}
