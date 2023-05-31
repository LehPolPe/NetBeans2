/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutosadiasyhoras;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class MinutosaDiasyHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese minutos");
        int min = leer.nextInt();
        int hs = Math.abs(min/60);
        int dias = Math.abs(hs/24);
        int hsExt = hs%24;
        System.out.println("El tiempo ingresado en minutos es equivalente a "+dias+" dias "+" y "+hsExt+" horas." );
    }
    
}
