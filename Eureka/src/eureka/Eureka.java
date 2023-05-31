/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eureka;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase, y mejor para vos que sea correcta...");
        String frase = leer.nextLine();
        if  (frase.equals("eureka") || frase.equals("Eureka")) {
             System.out.println("Correcto..."); 
        }else{
            System.out.println("Incorrecto...");
        }    
    }
    
}
