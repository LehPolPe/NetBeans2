/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.pooclssvcestudiantes;

import java.util.Arrays;
import lepolpelab.Ents.Alumnos;
import lepolpelab.Svc.SvcAlumnos;

/**
 *
 * @author usr
 */
public class PooClsSvcEstudiantes {

    public static void main(String[] args) {
        SvcAlumnos svc= new SvcAlumnos();
        Alumnos[] clase = svc.llenarClase();
        System.out.println(Arrays.toString(clase));
        System.out.println("El promedio es de "+svc.calcularPromedio(clase));
        System.out.println("La cantidad de alumnos que superan el promedio es "+svc.cuantosAlumnosSuperanElPromedio(clase));
        System.out.println("Quienes superan el promedio son "+Arrays.toString(svc.quienesSuperanElPromedio(clase, svc.cuantosAlumnosSuperanElPromedio(clase))));
    }
}
