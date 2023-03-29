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
public class Ej3Euros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un monto en euros");
        int euros = leer.nextInt();
        String respuesta = "";
        do{
        System.out.println("A que moneda desea convertir?");
        respuesta = leer.next();
        respuesta = respuesta.toUpperCase();
        switch (respuesta){
            case ("DOLARES"):
                dolar(euros);
                break;
            case ("YENES"):
                yen(euros);
                break;
            case ("LIBRAS"):
                libra(euros);
                break;
            default:
                System.out.println("Ingrese otra moneda, solo se aceptan Dolares, Yenes o Libras.");
        }
        } while (!respuesta.equals("DOLARES") && !respuesta.equals("YENES") && !respuesta.equals("LIBRAS"));
        
    }
    
    public static void dolar(int euros){
        double aux = euros * 1.28611;
        System.out.println(euros + " Euros son " + aux + " Dolares");
    }
    
    public static void yen(int euros){
        double aux = euros * 129852;
        System.out.println(euros + " Euros son " + aux + " Yenes");
}
    
    public static void libra(int euros){
        double aux = euros * 0.86;
        System.out.println(euros + " Euros son " + aux + " Dolares");
    }
}