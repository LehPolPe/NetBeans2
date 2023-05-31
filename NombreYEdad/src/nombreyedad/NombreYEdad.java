/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package nombreyedad;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class NombreYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion;
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese nombre completo");
            String nombre = leer.nextLine();
            System.out.println("Ingrese edad");
            int edad = leer.nextInt();
            nombrEdad(nombre, edad);
            System.out.println("Quiere seguir ingresando personas?");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
        System.out.println("Gracias por usar el programa, vuelva prontos...");
    }

    public static void nombrEdad(String nombre, int edad) {
        mayoria(edad);
        System.out.println("El nombre es " + nombre + ", su edad es " + edad + " años" + mayor);

    }
    public static String mayor;
    public static String mayoria(int edad) {

        if (edad < 18) {
            mayor = (" y es menor.");
        } else {
            mayor = (" y es mayor.");
        }
        return mayor;
    }
}
