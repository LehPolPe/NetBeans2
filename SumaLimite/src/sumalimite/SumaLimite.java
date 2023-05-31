/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumalimite;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SumaLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese numero limite");
        Scanner leer = new Scanner(System.in);
        double limite;
        limite = leer.nextDouble();
        double suma = 0;
        double num;
        do {

            System.out.println("ingrese numero a sumar");
            num = leer.nextDouble();
            suma += num;

        } while (suma <= limite);
        System.out.println("la suma total una vez superado el limite es: " + suma);
    }
    
}
