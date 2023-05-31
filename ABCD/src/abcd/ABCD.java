/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
 * and open the template in the editor.
 */
package abcd;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ABCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A, B, C, D, aux;
        System.out.println("Ingrese el valor de A, B, C y D");
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("el valor inicial de A es: " + C + " y su valor final es " + A);
        System.out.println("el valor inicial de B es: " + aux + " y su valor final es " + B);
        System.out.println("el valor inicial de C es: " + B + " y su valor final es " + C);
        System.out.println("el valor inicial de D es: " + A + " y su valor final es " + D);
    }

}
