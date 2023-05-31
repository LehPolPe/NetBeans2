/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumresmuldivdedos;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SumResMulDivdeDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "n";
        double numero1;
        double numero2;
        do {

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
                    System.out.println("Ingrese dos numeros...");
                    numero1 = leer.nextDouble();
                    numero2 = leer.nextDouble();
                    System.out.println("el resultado de la suma es " + (numero1 + numero2));
                    frase = "n";
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros...");
                    numero1 = leer.nextDouble();
                    numero2 = leer.nextDouble();
                    System.out.println("el resultado de la resta es " + (numero1 - numero2));
                    frase = "n";
                    break;
                case 3:
                    System.out.println("Ingrese dos numeros...");
                    numero1 = leer.nextDouble();
                    numero2 = leer.nextDouble();
                    System.out.println("el resultado de la multiplicacion es " + (numero1 * numero2));
                    frase = "n";
                    break;
                case 4:
                    System.out.println("Ingrese dos numeros...");
                    numero1 = leer.nextDouble();
                    numero2 = leer.nextDouble();
                    System.out.println("el resultado de la division es " + (numero1 / numero2));
                    frase = "n";
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    frase = leer.next();
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }

        } while (frase.equals("n") || frase.equals("N"));
    }

}
