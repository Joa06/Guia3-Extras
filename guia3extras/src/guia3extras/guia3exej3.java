/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

/**
 *
 * @author Usuario
 */
public class guia3exej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] vectorMain = new int[10];
        
        llenarVectorAleatorio(vectorMain);
  
        imprimirVector (vectorMain,"El tamaño del vector es:");
                
    }
   
    
    public static void llenarVectorAleatorio (int vector[])
    {
                 
        for (int i = 0; i < vector.length; i++) 
        {
          vector[i] = (int)(Math.random()*10+1);   
        }  
        
  
    }
    
    public static void imprimirVector (int vector[],String mensaje)
    {
         
        System.out.println(mensaje);
        System.out.println("----------------------");
        for (int i = 0; i < vector.length; i++) 
        {
            System.out.println(i+1+") "+vector[i]);   
        } 
        System.out.println("----------------------");        
        
       
    
    }
    
}
