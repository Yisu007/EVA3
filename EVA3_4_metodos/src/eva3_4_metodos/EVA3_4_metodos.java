/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_metodos;

/**
 *
 * @author Xxj53
 */
public class EVA3_4_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(encontrarMayor(100,400));
        System.out.println(encontrarDia(1));
    }
//valor mas grande entre dos numeros enteros 
    public static int encontrarMayor(int num1,int num2){
        
       // int resu;
       // if (num1 > num2)//comparar numero 1 con numero 2
        //resu=num1; 
       // else 
      
        //resu=num2;
       //     return resu;
       //metodo mas facil 
       if(num1>num2)
           return num1;
      else
          return num2;
       
    }
    //que regrese el dia de la semana 
    public static String  encontrarDia (int dia ){
        switch(dia){ //un encendidio y un apagado 
            case 1:
            return "domingo";
            case 2:
            return "lunes";
         case 3:
            return "martes";
         case 4:
            return "miercoles";
         case 5:
            return "jueves ";
         case 6:
            return "viernes ";
         case 7:
            return "sabado ";
         default:
             return "no ";
        }
    }
}
