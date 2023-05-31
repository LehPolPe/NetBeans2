/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcestudiantes;

import Ents.Estudiante;
import Svc.SvcEstudiantes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class PooClsSvcESTUDIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudiante[]> cursos = new ArrayList();

        boolean seguir = true;
        while (seguir) {
            System.out.println("Que desea hacer: 1- mostrar coleccion, 2- agregar Cursos, 3-removerCursos, 4- salir.");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            switch (leer.nextLine()) {
                case "1":
                    mostrarColeccion(cursos);
                    break;
                case "2":
                    agregarCurso(cursos);
                    break;
                case "3":
                    seguir=false;
                    break;
                case "4":
                    seguir=false;
                    break;
                default:
                    System.out.println("opcion incorrecta"); seguir=false;
            }
        }
    }

    public static void mostrarColeccion(ArrayList cursos) {
        SvcEstudiantes svc=new SvcEstudiantes();
        for (Object curso : cursos) {
            System.out.println(svc.mostrarEstudiantesNota(curso));
        }
    }

    public static void agregarCurso(ArrayList cursos) {
        System.out.println("");
        SvcEstudiantes svc = new SvcEstudiantes();
        Estudiante[] curso = svc.crearCurso();
        cursos.add(curso);
    }
}
