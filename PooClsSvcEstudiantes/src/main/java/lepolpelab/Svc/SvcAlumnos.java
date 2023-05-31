/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lepolpelab.Svc;

import java.util.Scanner;
import lepolpelab.Ents.Alumnos;

/**
 *
 * @author usr
 */
public class SvcAlumnos {

    Alumnos[] clase = new Alumnos[8];

    public Alumnos crearAlumno() {
        Alumnos alumno = new Alumnos();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno");
        alumno.setNombre(leer.nextLine());
        System.out.println("Ingrese la nota final del alumno");
        alumno.setNota(leer.nextInt());
        return alumno;
    }

    public Alumnos[] llenarClase() {
        for (int i = 0; i < 8; i++) {
            clase[i] = crearAlumno();
        }
        return clase;
    }

    public int calcularPromedio(Alumnos[] clase) {
        int aux = 0;
        for (int i = 0; i < 8; i++) {
            aux += clase[i].getNota();
        }
        return aux / 8;
    }

    public int cuantosAlumnosSuperanElPromedio(Alumnos[] clase) {
        int casep = 0;
        for (int i = 0; i < 8; i++) {
            if (clase[i].getNota() > calcularPromedio(clase)) {
                casep++;
            }

        }
        return casep;
    }

    public String[] quienesSuperanElPromedio(Alumnos[] clase, int casep) {
        int aux = 0;
        String[] qsep = new String[casep];
        for (int i = 0; i < 8; i++) {
            if (clase[i].getNota() > calcularPromedio(clase)) {
                qsep[aux] = clase[i].getNombre();
                aux++;
            }
        }
        return qsep;
    }

}
