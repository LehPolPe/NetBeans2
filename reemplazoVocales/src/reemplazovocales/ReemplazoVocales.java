/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reemplazovocales;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ReemplazoVocales {

    private static String frase1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cambiarVocal(frase);      
        System.out.println(frase1);
    }

    public static String cambiarVocal(String frase) {
    frase1=frase.replace("a","@").replace("e", "#").replace("i", "$").replace("o", "%").replace("u", "*");
    return frase1;
    }
}