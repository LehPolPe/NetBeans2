/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poomessecreto;

import Mes.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class PooMesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        MesSecreto svc = new MesSecreto();
        System.out.println("Ingrese el mes secreto");
        String mes = leer.nextLine();
        String aux = svc.mesSecreto();
        while (!mes.equals(aux)) {
            System.out.println("Incorrecto, el mes secreto ERA " + aux + ". Ingrese nuevo mes secreto.");
            aux = svc.mesSecreto();
            mes = leer.nextLine();
        }
        System.out.println("Correcto! el mes secreto es " + mes);
    }

}
