/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3captura;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA3_3CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = capturaTexto("introduce tu nombre");
        String apellido= capturaTexto("captura tu apellido ");
        int  Edad = capturaEdad("captura tu edad ");
        double sueldo = capturaSueldo ("captura tu sueldo");
        
        System.out.println("nombre:"+ nombre );
        System.out.println("   ");
        System.out.println("apellido:"+ apellido);
        System.out.println("    ");
        System.out.println ("edad:" + Edad );
        System.out.println("   ");
        
        System.out.println("sueldo:"+ sueldo );
    }
    //CAPTURA TEXTO 
    public static String capturaTexto(String mensaje ){
        Scanner captu= new Scanner (System.in);
        System.out.println (mensaje);
        String texto= captu.nextLine();
        return texto;
        
    }
    public static int capturaEdad(String mensaje){
        Scanner captu=new Scanner (System.in);
        System.out.println(mensaje );
        int texto1= captu.nextInt();
        return texto1;
        
    }
    public static double capturaSueldo(String mensaje ){
        Scanner captu= new Scanner (System.in);
        System.out.println (mensaje );
        int texto2= captu.nextInt();
        return texto2 ;
    }
}
