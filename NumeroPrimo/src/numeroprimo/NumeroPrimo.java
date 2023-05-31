/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número, se le indicará si es primo o no.");
        int numero = leer.nextInt();
        System.out.println(primo(numero));
    }

    public static boolean primo(int numero) {
        int contador = 1;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                contador += 1;
            }
        }
        return contador == 2 || numero==1;
    }
}
