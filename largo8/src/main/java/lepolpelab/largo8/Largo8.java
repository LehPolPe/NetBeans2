/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.largo8;

import java.util.Scanner;



/**
 *
 * @author usr
 */
public class Largo8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase, y mejor para vos que sea correcta...");
        String frase = leer.nextLine();
        
        if  (frase.length() == 8) {
             System.out.println("Correcto..."); 
        }else{
            System.out.println("Incorrecto...");
        }
    }
    
}
