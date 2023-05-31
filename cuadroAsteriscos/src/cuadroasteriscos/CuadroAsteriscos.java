/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadroasteriscos;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class CuadroAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese N elementos");
       int Ne = leer.nextInt();
       for (int i = 1; i <= Ne; i++) {
            System.out.print("* ");
        }
       System.out.println("");
       for (int i =1; i< Ne-1; i++){
           for (int j = 1; j <= Ne; j++) {
           if (j == 1 || j == Ne){
               System.out.print("* ");
           }else{
               System.out.print("  ");
           } 
         }
           System.out.println("");
       }
       
       for (int i = 1; i <= Ne; i++) {
            System.out.print("* ");
        }

    }
    
}
