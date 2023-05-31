/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compañerosequipo;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class CompañerosEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de compañeros de equipo");
        int i;
        int num = leer.nextInt();
        String[] equipo = new String[num];
        for (i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre del compañero en la posición " + i);
            equipo[i] = leer.next();
        }
        for (i = 0; i < num; i++) {
            System.out.println("El nombre del compañero en la posición " + (i) + " es " + equipo[(i)]);

        }
    }
}
