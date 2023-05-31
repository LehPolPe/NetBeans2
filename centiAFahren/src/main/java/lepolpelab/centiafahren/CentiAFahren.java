/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.centiafahren;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class CentiAFahren {

    public static void main(String[] args) {
        System.out.println("Ingrese temperatura en grados centígrados");
        Scanner leer = new Scanner(System.in);
        float numero1 = leer.nextFloat();
        System.out.println("la temperratura en grados fahren es "+(32 + 9*numero1/5));
    }
}
