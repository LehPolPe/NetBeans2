/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reemplazovocales3;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ReemplazoVocales3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println(cambiarVocal(frase));
    }

    public static String cambiarVocal(String frase) {
        String frase1 = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case ("a"):
                    frase1 = frase1.concat("@");
                    break;
                case ("e"):
                    frase1 = frase1.concat("#");
                    break;
                case ("i"):
                    frase1 = frase1.concat("$");
                    break;
                case ("o"):
                    frase1 = frase1.concat("%");
                    break;
                case ("u"):
                    frase1 = frase1.concat("*");
                    break;
                default:
                    frase1 = frase1.concat(frase.substring(i, i + 1));
                    ;
            }
        }
        return frase1;
    }
}
