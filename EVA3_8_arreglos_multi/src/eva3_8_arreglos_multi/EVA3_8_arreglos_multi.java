/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_arreglos_multi;

/**
 *
 * @author Xxj53
 */
public class EVA3_8_arreglos_multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] cubo = new int [2][5][3];// 30 
        for (int i = 0 ; i < 10;i++){// primera dimension 
            
                for (int j = 0 ; j < 10;j++){//segunda dimension 
                    
                    
                    for (int k = 0 ; k < 10;k++){// tercera dimension 
                        cubo[i][j][k] =(int)(Math.random() * 100);
                        
                    }
                    
                }
            }
        //imprimir los valores 
        
                for (int i = 0 ; i < 10;i++){// primera dimension 
            
                for (int j = 0 ; j < 10;j++){//segunda dimension 
                    
                    
                    for (int k = 0 ; k < 10;k++){// tercera dimension 
                        System.out.print("[" + cubo [i][j][k] + "]" );
                        }
                
                }
                
        }
    }
}