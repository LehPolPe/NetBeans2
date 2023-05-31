/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.mayordedos;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class MayorDeDos {

    public static void main(String[] args) {
        
        System.out.println("Ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        System.out.println("el mayor numero ingresado es: " + Math.max(numero1, numero2));
    }
}
