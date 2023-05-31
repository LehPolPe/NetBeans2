/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.dobletripleraiz;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class DobleTripleRaiz {

    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();
        System.out.println("el doble es "+(numero1*2)+", el triple es "+ (numero1*3)+", y su raiz cuadrada es "+ Math.sqrt(numero1));
    }
}
