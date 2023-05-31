/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cambiarVocal(frase);
    }

    public static void cambiarVocal(String frase) {
        System.out.println(frase.replace("a", "@").replace("e", "#").replace("i", "$").replace("o", "%").replace("u", "*"));
    }

}
