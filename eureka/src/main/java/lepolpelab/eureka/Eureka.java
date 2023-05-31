/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.eureka;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Eureka {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase, y mejor para vos que sea correcta...");
        String frase = leer.nextLine();
        if  (frase.equals("eureka")) {
             System.out.println("Correcto..."); 
        }else{
            System.out.println("Incorrecto...");
        }
    }
}
