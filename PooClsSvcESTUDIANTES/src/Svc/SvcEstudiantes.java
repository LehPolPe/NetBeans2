/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.Estudiante;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcEstudiantes {
    int ca = 3;
    Estudiante[] curso = new Estudiante[ca];
    String[] nombre={"Lucía", "María", "Martina", "Sofía", "Emma", "Julia", "Daniela", "Carla", "Alma", "Olivia", "Vega", "Lola", "Valentina", "Abril", "Adara", "Aria", "Alexa", "Chiara", "Julieta","Martín", "Hugo", "Mateo", "Leo", "Lucas", "Manuel", "Daniel", "Alejandro", "Pablo", "Enzo", "Álvaro","Adam", "Arán", "Axel", "Biel", "Gael"};
    public Estudiante[] crearCurso() {

        for (int i = 0; i < ca; i++) {
            //Scanner leer = new Scanner(System.in).useDelimiter("\n");
            Estudiante alumno = new Estudiante();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(nombre[(int)(Math.random()*(nombre.length-1))]);
            System.out.println("Ingrese la nota final del alumno");
            alumno.setNota((int)(Math.random()*10));
            curso[i] = alumno;
        }

        return curso;

    }

    public int promedio(Estudiante[] curso) {
        int aux = 0;
        for (int i = 0; i < ca; i++) {
            aux += curso[i].getNota();
        }
        return aux / ca;
    }

    public String[] estudiantesDestacados(Estudiante[] curso) {
        int aux = 0;
        for (int i = 0; i < ca; i++) {
            if (curso[i].getNota() > promedio(curso)) {
                aux++;
            }
        }
        String[] ed = new String[aux];
        int aux2 = 0;
        for (int i = 0; i < ca; i++) {
            if (curso[i].getNota() > promedio(curso)) {
                ed[aux2] = curso[i].getNombre();
                aux2++;
            }
        }
        return ed;
    }
    
}
