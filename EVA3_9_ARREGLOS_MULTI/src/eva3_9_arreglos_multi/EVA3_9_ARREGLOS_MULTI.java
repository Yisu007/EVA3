/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_arreglos_multi;

/**
 *
 * @author Xxj53
 */
public class EVA3_9_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] billetes = {20,50,100,200,500,1000};
        System.out.println(billetes.length);
        String [][] ciudades ={{"aguascalientes","calvillo","jesus maria"},
                                {"ensenada","mexicali","tecate","tijuana"},
                                 {"la paz","cabo san lucas","san jose del cabo"}};
                                 
        
        for (int i=0;i< ciudades.length;i++) {
       for (int j=0;j<ciudades[i].length ;j++) {
       System.out.println(ciudades [i][j]);
       
    } 
        
        
    }
    
    }
    
}
