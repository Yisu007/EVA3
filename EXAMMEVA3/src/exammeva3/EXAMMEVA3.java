/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exammeva3;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EXAMMEVA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // ponle un promedio de calificacion al siguiente codigo 
        Scanner captu = new Scanner(System.in);

       System.out.print("!!Hola usuario,Ingrese el número de estudiantes!!:");
       
      
            int numEstudiantes = captu.nextInt();

          if(numEstudiantes<=0) {
            System.out.println("!!invalido, el numero tiene que ser mayor a '0'!! ");
            return;
            
        }

      
           double[]califa= new double[numEstudiantes];

       
        System.out.println("!!ingresa aqui la calificacion de los estudiantes:!!:");
        
       
          for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Calificación del estudiante numero " + (i + 1) + ": ");
               califa[i] = captu.nextDouble();
         double suma = numEstudiantes;
         
        }
          
          System.out.println("calificacion total"  );
              
          
  
          
          
         
        
         
         
        
    }
        
        
     }
         
     
         
    }
    

