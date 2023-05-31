/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunombre;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class TuNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es tu nombre...");
        String nombre = leer.next();
        System.out.println("tu nombre, delicado copo de nieve, es: " + nombre);
    }
    
}
