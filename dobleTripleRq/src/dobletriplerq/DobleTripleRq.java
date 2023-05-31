/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobletriplerq;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class DobleTripleRq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Ingrese un número");
    Scanner leer = new Scanner(System.in);
    int numero1 = leer.nextInt();
    System.out.println("el doble es "+(numero1*2)+", el triple es "+ (numero1*3)+", y su raiz cuadrada es "+ Math.sqrt(numero1));
    }
    
}
