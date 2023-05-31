/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import java.util.Date;
import java.util.Scanner;

/**
 * j
 *
 * @author usr
 */
public class SvcDate {

    Date fechaNac = new Date();
    Date fechaActual = new Date();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date crearFN() {
        System.out.print("Ejercicio 4: \n\n\t Ingrese año de nacimiento: ");
        fechaNac.setYear(leer.nextInt()-1900);
        System.out.print("\t Ingrese mes de nacimiento: ");
        fechaNac.setMonth(leer.nextInt()-1);
        System.out.print("\t Ingrese dia de nacimiento: ");
        fechaNac.setDate(leer.nextInt());
        return fechaNac;
    }

    public Date crearFA() {
        return fechaActual;
    }

    public int difAnios() {
        int difA = fechaActual.getYear() - fechaNac.getYear();
        if (fechaActual.getMonth()==fechaNac.getMonth()) {
            if (fechaActual.getDate()>=fechaNac.getDate()) {
                difA--;
            }
        }
        if (fechaActual.getMonth()<fechaNac.getMonth()) {
            difA--;
        }
        return difA;
    }

}
