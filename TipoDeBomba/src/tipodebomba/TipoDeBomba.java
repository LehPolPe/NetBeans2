/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodebomba;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class TipoDeBomba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tipo de motor de la bomba:");
        int numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de nafta");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
