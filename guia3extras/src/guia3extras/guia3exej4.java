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
public class guia3exej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  Scanner leer = new Scanner (System.in); 
        
        int filas = 3;
        int columnas = 4;
        
        int aprobados = 0;
        int desaprobados = 0;
        Scanner leer = new Scanner(System.in);   
        
        float [][] mNotas = new float [filas][columnas];
        float [] vNotasFinales = new float[filas];
        
       
        for (int i = 0; i < filas; i++) 
        {
            System.out.println("Ingrese notas:Alumno:("+(i+1)+")");
            for (int j = 0; j < columnas; j++) 
            {
                System.out.println("Nota: ("+(j+1)+")");
                do
                {
                  mNotas[i][j] = leer.nextFloat();
                  if (mNotas[i][j]<1 || mNotas[i][j]>10)
                  {
                      System.out.println("Nota invalida.");
                  }
                }while(mNotas[i][j]<1 || mNotas[i][j]>10);
                
            }
      
        }
        
        //Calcular Porcentaje
/*
        for (int i = 0; i < filas; i++) 
        {
            for (int j = 0; j < columnas; j++) 
            {
             
                switch(j)
                {
                    case 0:
                        //Porcentaje 10
                        vNotasFinales[i]+=mNotas[i][j]*0.1;
                        break;
                    case 1:
                        //%15
                         vNotasFinales[i]+=mNotas[i][j]*0.15;
                        break;
                    case 2:
                        //%25
                         vNotasFinales[i]+=mNotas[i][j]*0.25;
                        break;
                    case 3:
                         vNotasFinales[i]+=mNotas[i][j]*0.5;
                        //%50
                        break;
                }  
            }
           
            if (vNotasFinales[i] >= 7)
            {
                aprobados++;
            }
            else
            {
                desaprobados++;
            }
 
        }
 */      
       
        
        for (int i = 0; i < filas; i++) 
        {
            vNotasFinales[i] =(float)(mNotas[i][0]*0.1  + (mNotas[i][1]*0.15) + (mNotas[i][2]*0.25) + (mNotas[i][3]*0.5));
            
            System.out.println("Nota final Alumno:("+(i+1)+")" + vNotasFinales[i]);
            
            if (vNotasFinales[i] >= 7)
            {
                aprobados++;
            }
            else
            {
                desaprobados++;
            }
        }

 
        System.out.println("Aprobados: " + aprobados 
                +"\nDesaprobados:" + desaprobados);
      
        

       
    
    }
    
}
