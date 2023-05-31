/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import Ents.Cafetera;
import Svc.CafeteraSvc;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
        boolean salir = false;

        CafeteraSvc scn = new CafeteraSvc();
        Cafetera cn = scn.crearCafetera();
        do {
            System.out.println("Que desea hacer:");
            System.out.println("1. consultar cantidad de cafe.");
            System.out.println("2. Agregar cafe. ");
            System.out.println("3. Servir Taza.");
            System.out.println("4. Vaciar Cafetera. ");
            System.out.println("5. Llenar cafetera.");
            System.out.println("6. salir.");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    scn.toString(cn);
                    break;
                case 2:
                    scn.agregarCafe(cn);
                    break;
                case 3:
                    scn.servirTaza(cn);
                    break;
                case 4:
                    scn.vaciarCafetera(cn);
                    break;
                case 5:
                    scn.llenarCafetera(cn);
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
