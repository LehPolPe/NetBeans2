/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcestudiantes;

import Ents.Estudiante;
import Svc.SvcEstudiantes;
import java.util.Arrays;

/**
 *
 * @author usr
 */
public class PooClsSvcESTUDIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcEstudiantes svc=new SvcEstudiantes();
        Estudiante[] curso=svc.crearCurso();
        System.out.println(Arrays.toString(curso));
        System.out.println("El promedio de nota final de la clase es "+svc.promedio(curso));
        System.out.println("Los alumnos que superan el promedio de la clase son "+Arrays.toString(svc.estudiantesDestacados(curso)));
    }
    
}
