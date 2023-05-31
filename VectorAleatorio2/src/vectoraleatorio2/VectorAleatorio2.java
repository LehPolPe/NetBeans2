/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoraleatorio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class VectorAleatorio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ale=new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector.");
        int num = leer.nextInt();

        int[] vector = new int[num];
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * num + 1);
        }
        System.out.println();
        for (int vec : vector) {
            System.out.print(" " + vec);
        }
        System.out.println();
        System.out.println("Ingrese el numero a buscar en el vector");
        int nab = leer.nextInt();
        int cont = 0;
        String pos = "";
        for (int i = 0; i < num; i++) {
            if (nab == vector[i]) {
                cont += 1;
                pos = pos.concat(i + ", ");
            }
        }
        if (cont == 0) {
            System.out.println("El numero " + nab + " no se encuentra en el vector");
        } else {
            System.out.println("El numero " + nab + " se encuentra " + cont + " veces en el vector en las posiciones " + pos);
        }
    }
}
