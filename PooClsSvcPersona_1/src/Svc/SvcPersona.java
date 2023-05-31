/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.Persona;
import java.util.Scanner;

/*
 * @author usr
 */
public class SvcPersona {

    public Persona crearPersona() {
        Persona prsn = new Persona();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese nombre de la persona");

        prsn.setNombre(leer.nextLine());

        System.out.println("Ingrese sexo de la persona, M para masculino, F para femenino y O para otro");
        String s3xo = leer.nextLine();
        while (!s3xo.equals("M") && !s3xo.equals("F") && !s3xo.equals("O")) {
            System.out.println("Opcion incorrecta. Por favor, ingrese nuevamente.");
            s3xo = leer.nextLine();
        }
        prsn.setSexo(s3xo);

        System.out.println("Ingrese edad de la persona");

        prsn.setEdad(leer.nextInt());

        System.out.println("Ingrese peso de la persona");

        prsn.setPeso(leer.nextInt());

        System.out.println("Ingrese altura de la persona");

        prsn.setAltura(leer.nextDouble());

        return prsn;

    }

    public boolean esMayorDeEdad(Persona prsn) {
        return (prsn.getEdad() > 17);
    }

    public int calcularIMC(Persona prsn) {
        int IMC;
        if ((double) (prsn.getPeso() / Math.pow(prsn.getAltura(), 2)) < 20) {
            IMC = -1;
        } else if ((double) (prsn.getPeso() / Math.pow(prsn.getAltura(), 2)) >= 20 && (double) (prsn.getPeso() / Math.pow(prsn.getAltura(), 2)) <= 25) {
            IMC = 0;
        } else {
            IMC = 1;
        }
        return IMC;

    }
}
