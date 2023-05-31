/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvccuentabancaria;

import Entidades.CuentaBancaria;
import Servicio.ServicioCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class PooClsSvcCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        ServicioCuentaBancaria scb = new ServicioCuentaBancaria();
        CuentaBancaria cb = scb.altaCuentaBancaria();
        do {
            System.out.println("Que desea hacer:");
            System.out.println("1. consultar saldo.");
            System.out.println("2. ingresar dinero. ");
            System.out.println("3. retirar dinero.");
            System.out.println("4. extraccion rapida. ");
            System.out.println("5. consultar datos de la cuenta.");
            System.out.println("6. salir.");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    scb.mostrarSaldo(cb);
                    break;
                case 2:
                    scb.ingresar(cb);
                    break;
                case 3:
                    scb.retirar(cb);
                    break;
                case 4:
                    scb.extraccionRapida(cb);
                    break;
                case 5:
                    scb.mostrarDatos(cb);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (!salir);

    }

}
