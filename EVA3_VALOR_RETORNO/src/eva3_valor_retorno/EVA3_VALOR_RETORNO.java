/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_valor_retorno;

/**
 *
 * @author Xxj53
 */
public class EVA3_VALOR_RETORNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NECESITAS RECUPERAAR EL VALOR,PARA HACER ALGO CON EL 
        //no les interesa el resultado 
        int resu;
        resu= sumaDosNumeros(5,10);
        System.out.println("resultado =" + resu);
        //segunda alternativa 
        System.out.println("resultado=" + sumaDosNumeros(5,10));
        
        //no le interesa el resultadp 
         sumaDosNumeros(5,10);//el resultado se pierde  
        
    }
    public static int sumaDosNumeros (int num1,int num2){
        return num1 + num2; //que regresa un valor siempre se pone en un int 
                
    }
}
