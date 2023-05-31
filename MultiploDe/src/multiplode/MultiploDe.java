/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package multiplode;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class MultiploDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.println("Ingrese dos numeros");
        a=leer.nextInt();
        b=leer.nextInt();
        multiplo(a, b);
    }

    public static void multiplo(int a, int b) {
        if (a % b == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else {
            System.out.println(a + " NO es múltiplo de " + b);
        }

    }
}
