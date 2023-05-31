

package Svc;

import Ents.Curso;
import java.util.Scanner;


public class SvcCurso {
    String[] al=new String[5];
    public void cargarAlumnos(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 5; i++) {
            al[i]=leer.nextLine();
        }
    }
    public Curso crearCurso(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Curso c = new Curso();
        System.out.println("Ingrese el nombre del Curso.");
        c.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese el turno del Curso, mañana o tarde.");
        c.setTurno(leer.nextLine());
        System.out.println("Ingrese los alumnos del curso.");
        cargarAlumnos();
        c.setAlumnos(al);
        System.out.println("Ingrese la cantidad de hs diarias del curso.");
        c.setCantidadHsDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias en la semana del curso.");
        c.setCantidadDiasSemana(leer.nextInt());
        System.out.println("Ingrese el precio de la hr del curso.");
        c.setPrecioHora(leer.nextInt());
        
        return c;
    }
    public void calcularGananciaSemanal(Curso c){
        System.out.println("La ganancia Semanal es de $:"+(c.getCantidadDiasSemana()*c.getCantidadHsDia()*c.getPrecioHora()*5));
    }
}
