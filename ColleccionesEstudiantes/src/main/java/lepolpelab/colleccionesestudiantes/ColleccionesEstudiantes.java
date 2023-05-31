/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lepolpelab.colleccionesestudiantes;

import Ents.Alumno;
import Svc.Svc;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ColleccionesEstudiantes {

    public static void main(String[] args) {
        Svc svc = new Svc();
        ArrayList<Alumno> crs = svc.crearCurso();
        System.out.println(crs);
        boolean cnt=true;
        while (cnt) {
            System.out.println("");
            System.out.println("Ingrese opcion: 1- mostrar curso. 2- ingresar alumno. 3- mostrar promedio. 4- salir.");
            Scanner leerInt=new Scanner(System.in);
            switch (leerInt.nextInt()) {
                case 1 -> System.out.println(crs);
                case 2 -> crs.add(svc.crearAlumno());
                case 3 ->  System.out.print("El promedio es "+svc.promedioNotas(crs));
                case 4 ->  cnt=false;
                default -> System.out.print("opcion incorrecta.");
            }
        }
    }
}
