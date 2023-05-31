/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumresmuldiv2numxfuncion;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SumResMulDiv2NumXfuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "n";
        double numero1;
        double numero2;
        do {
            System.out.println("Ingrese dos numeros...");
            numero1 = leer.nextDouble();
            numero2 = leer.nextDouble();
            System.out.println("Ingrese opcion");
            int operacion;
            System.out.println("Menu: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            operacion = leer.nextInt();
            switch (operacion) {
                case 1:
                    sumar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 2:
                    restar(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:

                    multiplcr(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 4:
                    dividir(numero1, numero2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    frase = leer.next();
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }

        } while (frase.equalsIgnoreCase("n"));
    }
    private static double resultado;

   private static double sumar(double numero1, double numero2) {
        resultado = numero1 + numero2;
        return resultado;
    }

    public static double restar(double numero1, double numero2) {
        resultado = numero1 - numero2;
        return resultado;
    }

    public static double multiplcr(double numero1, double numero2) {
        resultado = numero1 * numero2;
        return resultado;
    }

    public static double dividir(double numero1, double numero2) {
        resultado = numero1 / numero2;
        return resultado;
    }

}
