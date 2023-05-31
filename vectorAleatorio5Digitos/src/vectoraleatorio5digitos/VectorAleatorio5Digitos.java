/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package vectoraleatorio5digitos;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class VectorAleatorio5Digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector.");
        int num = leer.nextInt();
        int cont1=0; int cont2=0; int cont3=0; int cont4=0; int cont5=0;
        int[] vector = new int[num];
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 20000 + 1);
        }
        System.out.println();
        for (int vec : vector) {

            if (vec < 10) {
                System.out.println(vec + "tiene un solo dígito."); cont1+=1;
            } else if (vec < 100) {
                System.out.println(vec + "tiene dos dígitos."); cont2+=1;
            } else if (vec < 1000) {
                System.out.println(vec + "tiene tres dígitos."); cont3+=1;
            } else if (vec < 10000) {
                System.out.println(vec + "tiene cuatro dígitos."); cont4+=1;
            } else {
                System.out.println(vec + "tiene cinco dígitos."); cont5+=1;
            }

        }
       System.out.println("en total hay "+cont1+" numeros de un dígito, "+cont2+" numeros de dos dígitos, "+cont3+" numeros de tres dígitos, "+cont4+" numeros de cuatro dígitos y "+cont5+" numeros de cinco dígitos.");
    }

}
