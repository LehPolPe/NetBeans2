/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs232;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa cadena");
        String frase = leer.nextLine();
        
        int contadorC = 0;
        int contadorI = 0;
        while (!frase.equals("&&&&&")){
        
            if  (frase.length() <= 5 && frase.substring(0, 1).equals("X") && frase.substring(frase.length()-1).equals("O")) {
             System.out.println("Correcto...");
             contadorC += 1;
            }else{
             System.out.println("Incorrecto...");
             contadorI += 1;
            }
            System.out.println("Ingresa cadena");
            frase = leer.next();
        }
        System.out.println("Finalizo la lectura, registrandose "+ contadorC +" cadenas correctas y "+ contadorI +" cadenas incorrectas.");
    } 
    
}
