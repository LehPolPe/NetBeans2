/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centiafahren;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class CentiAFahren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Ingrese temperatura en grados centígrados");
    Scanner leer = new Scanner(System.in);
    double numero1 = leer.nextDouble();
    System.out.println("la temperratura en grados fahren es "+(32 + 9*numero1/5));

    }
    
}