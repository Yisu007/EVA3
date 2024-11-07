/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_metodos_arreglos;

/**
 *
 * @author Xxj53
 */
public class EVA3_5_METODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[]= {"lunes" , "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        imprimirArreglo(diasSemana);
        String meses[]= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        imprimirArreglo(meses);
        String billete [] = {"20","50","100","200","500","1000"};
        imprimirBillete(billete);
    }
    //imprimir un arreglo de cadena 
    public static void imprimirArreglo(String[]arreglo){                          //variables locales
        for(int i=0;i< arreglo.length;i++)
            System.out.println (arreglo[i]);
    }
    public static void imprimirBillete(int[]arreglo){
        for(int i=0;i< arreglo.length;i++)
            System.out.print(arreglo[i]);
    }
}
