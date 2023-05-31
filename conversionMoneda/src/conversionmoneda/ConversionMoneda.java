/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i.
ii.
iii.
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package conversionmoneda;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ConversionMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de dinero en euros a convertir");
        double dinero = leer.nextDouble();
        System.out.println("Ingrese a que moneda desea convertir: libra, dolar, yen");
        String moneda = leer.next();
        convertir(dinero, moneda);
    }

    public static void convertir(double dinero, String moneda) {
        switch (moneda) {
            case "libra":
                System.out.println("La canitidad ingresada equivale a " + (dinero * 0.86) + " libras.");
                break;
            case "dolar":
                System.out.println("La canitidad ingresada equivale a " + (dinero * 1.28611) + " dolares.");
                break;
            case "yen":
                System.out.println("La canitidad ingresada equivale a " + (dinero * 129.852) + " yenes.");
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
}
