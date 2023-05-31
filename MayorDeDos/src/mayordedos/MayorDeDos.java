/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayordedos;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class MayorDeDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        System.out.println("el mayor numero ingresado es: " + Math.max(numero1, numero2));
    }
    
}
