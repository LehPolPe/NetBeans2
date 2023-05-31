/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.sumadosnumeros;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SumaDosNumeros {

    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int numero3 = numero1 + numero2;
        System.out.println("la suma de los num. ingresados es: " + numero3);
        
    }
}
